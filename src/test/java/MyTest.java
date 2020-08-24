import com.shindo.inter.Calculator;
import com.shindo.inter.MyCalculator;
import com.shindo.proxy.CalculatoryProxy;

/**
 * @Author: 杨耿
 * @Description:
 * @Date: Create in 2020/8/21
 * @Modified By:
 * @Modified Date:
 */
public class MyTest {
	public static void main(String[] args) {
//		Calculator calculator = new MyCalculator();
		Calculator calculator = CalculatoryProxy.getProxy(new MyCalculator());
		System.out.println(calculator.add(1, 2));
		System.out.println(calculator.sub(1, 2));
		System.out.println(calculator.mult(1, 2));
		System.out.println(calculator.div(1, 2));
	}
}
