package com.shindo.proxy;

import com.shindo.inter.Calculator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description: Calculatory 动态代理
 * @Author: 杨耿
 * @Date: Create in 2020/8/21
 * <p>
 * 使用proxy的newProxyInstance()方法和InvocationHandler
 * <p>
 * 必须要有接口，如果没有接口，不能使用，这种方式是用jdk提供的reflect包下的类
 * 但是在生产环境中我不能保证每个类都有实现的接口，所有有第二种方式cglib
 * <p>
 * cglib在实现的时候有没有接口都无所谓
 * <p>
 * 在spring中使用了两种动态代理的方式，一种是jdk提供的（刚刚完成的）另外一种就是cglib
 */
public class CalculatoryProxy {

	public static Calculator getProxy(final Calculator calculator) {
		ClassLoader classLoader = calculator.getClass().getClassLoader();
		Class<?>[] interfaces = calculator.getClass().getInterfaces();

		InvocationHandler invocationHandler = new InvocationHandler() {
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("before invoke");
				Object invoke = method.invoke(calculator, args);
				System.out.println("after invoke");
				return invoke;
			}
		};

		Object o = Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
		return (Calculator) o;
	}

}
