package com.heima.base;

public class Base {
	public static void main(String[] args) {
//		demo1();
		String s1 = "";
		String s2 = new String("");
		String s3 = "";
		String s4 = String.valueOf("");
		String s5 = String.valueOf("");
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s3 == s4);
		System.out.println(s1 == s4);
		System.out.println(s4 == s5);
		
	}

	private static void demo1() {
		int i1 = 1;
		Integer i2 = new Integer(1);
		Integer i3 = 1;
		Integer i4 = Integer.valueOf(1);
		Integer i5 = Integer.valueOf(1);
		
		System.out.println(i1 == i2);
		System.out.println(i2 == i3);
		System.out.println(i3 == i4);
		System.out.println(i1 == i4);
		System.out.println(i4 == i5);
	}
}
