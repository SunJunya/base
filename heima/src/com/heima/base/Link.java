package com.heima.base;

public class Link {
	static byte b;
	static short a;
	static int c;
	static long l;
	static float f;
	static double d;
	static char ch;
	static boolean boo;
	public static void main(String[] args) {
//		calendarDemo1();
//		Object
		System.out.println(b);
		System.out.println(a);
		System.out.println(c);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(boo);
		System.out.println(f);
	}

	
}
class Node<T>{
	T data;
	Node<T> next;
	Node<T> prev;
}