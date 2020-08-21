package com.shindo.inter;

import com.shindo.util.LogUtil;

/**
 * @Author: 杨耿
 * @Description:
 * @Date: Create in 2020/8/21
 * @Modified By:
 * @Modified Date:
 */
public class MyCalculator implements Calculator {
	public int add(int i, int j) {
		LogUtil.start(i, j);
		int result = i + j;
		LogUtil.end(result);
		return result;
	}

	public int sub(int i, int j) {
		LogUtil.start(i, j);
		int result = i - j;
		LogUtil.end(result);
		return result;
	}

	public int mult(int i, int j) {
		LogUtil.start(i, j);
		int result = i * j;
		LogUtil.end(result);
		return result;
	}

	public int div(int i, int j) {
		LogUtil.start(i, j);
		int result = i / j;
		LogUtil.end(result);
		return result;
	}
}
