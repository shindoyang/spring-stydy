package com.shindo.util;

import java.util.Arrays;

/**
 * @Author: 杨耿
 * @Description:
 * @Date: Create in 2020/8/21
 * @Modified By:
 * @Modified Date:
 */
public class LogUtil {
	public static void start(Object... objects) {
		System.out.println("XXX方法开始执行，使用的参数是：" + Arrays.asList(objects));
	}

	public static void end(Object... objects) {
		System.out.println("XXX方法执行结束，结果是：" + Arrays.asList(objects));
	}
}
