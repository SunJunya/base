package com.heima.tools;

import java.util.Arrays;

public class Regex {
	public static void main(String[] args) {
//		myspilt();
//		myreplace();
		String string="����������������ҪҪҪҪҪҪҪѧѧѧѧѧѧ���";
		string=string.replaceAll("(.)\\1+", "$1");
		System.out.println(string);
	}

	private static void myreplace() {
		String s="dfjf89khw90k90";
		String s1=s.replaceAll("[0-9]", "");
		String s2=s.replaceAll("\\d", "");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
	}

	private static void myspilt() {
		/*�ַ�������91 27 46 38 50��
		 * ���ַ����ڲ����ֽ�������
		 * */
		String s="91 27 46 38 50";
		String[] ss=s.split(" ");
		int[] arr=new int[ss.length];
		for(int i=0;i<ss.length;i++){
			arr[i]=Integer.parseInt(ss[i]);
		}
		Arrays.sort(arr);
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<ss.length;i++){
			
			if(i==ss.length-1){
				sb.append(arr[i]);
			}else {
				sb.append(arr[i]+" ");
			}
		}
		
		System.out.println(sb);
	}
}
