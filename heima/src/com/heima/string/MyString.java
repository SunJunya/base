package com.heima.string;

public class MyString {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append("123");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		StringBuffer sb2 = new StringBuffer("123");
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		sb2.append("123");
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
	}
}
