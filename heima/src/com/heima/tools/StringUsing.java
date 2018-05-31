package com.heima.tools;

public class StringUsing {

	public static void main(String[] args) {
		/*
		 * [a-d[m-p]]:[a-dm-p]
		 * */
		String s1="a";
		String s2="b";
		String s3="e";
		String s4="l";
		String s5="m";
		String s6="o";
		String s7="n";
		
		String math="[a-d[m-p]]";
		System.out.println(s1.matches(math));
		System.out.println(s2.matches(math));
		System.out.println(s3.matches(math));
		System.out.println(s4.matches(math));
		System.out.println(s5.matches(math));
		System.out.println(s6.matches(math));
		System.out.println(s7.matches(math));
		
		
	}

}
