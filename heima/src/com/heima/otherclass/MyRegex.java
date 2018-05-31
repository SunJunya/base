package com.heima.otherclass;

import java.util.Arrays;

public class MyRegex {
	public static void main(String[] args) {
//		demo1();
		String s="我我你好....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程";
		s=s.replaceAll("\\.", "");
		s=s.replaceAll("(.)\\1+","$1");
		System.out.println(s);
		
//		demo3();
		
	}

	private static void demo3() {
		String s="快快另外喔妮妮";
		System.out.println(s.matches("(.)\\1(.*)(.)\\3"));
	}

	private static void demo1() {
		String s="ubiidasefwwwosfnfff";
		String[] a=s.split("(.)\\1+");
		System.out.println(Arrays.toString(a));
	}
}
