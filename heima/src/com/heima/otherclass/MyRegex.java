package com.heima.otherclass;

import java.util.Arrays;

public class MyRegex {
	public static void main(String[] args) {
//		demo1();
		String s="�������....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��";
		s=s.replaceAll("\\.", "");
		s=s.replaceAll("(.)\\1+","$1");
		System.out.println(s);
		
//		demo3();
		
	}

	private static void demo3() {
		String s="������������";
		System.out.println(s.matches("(.)\\1(.*)(.)\\3"));
	}

	private static void demo1() {
		String s="ubiidasefwwwosfnfff";
		String[] a=s.split("(.)\\1+");
		System.out.println(Arrays.toString(a));
	}
}
