package com.heima.otherclass;

import java.math.BigDecimal;

public class MyBig {
	public static void main(String[] args) {
		demo1();
		demo2();
		BigDecimal bd1= BigDecimal.valueOf(2.0);
		BigDecimal bd2=BigDecimal.valueOf(1.1);
		System.out.println(bd1.subtract(bd2));
	}

	private static void demo2() {
		BigDecimal bd1= new BigDecimal("2.0");
		BigDecimal bd2=new BigDecimal("1.1");
		System.out.println(bd1.subtract(bd2));
	}

	private static void demo1() {
		BigDecimal bd1= new BigDecimal(2.0);
		BigDecimal bd2=new BigDecimal(1.1);
		System.out.println(bd1.subtract(bd2));
		System.out.println(2.0-1.1);
	}
}