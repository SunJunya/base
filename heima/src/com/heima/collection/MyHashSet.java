package com.heima.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class MyHashSet {
	public static void main(String[] args) {
//		demo1();
//		demo2();

		demo3();
		
	}

	private static void demo3() {
//		�������е��ظ�Ԫ��ȥ��
		ArrayList<Integer> arrayList =new ArrayList<>();
		arrayList.add(1);
		arrayList.add(1);
		arrayList.add(1);
		arrayList.add(3);
		arrayList.add(3);
		arrayList.add(3);
		arrayList.add(3);
		arrayList.add(3);
		arrayList.add(1);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(2);
		arrayList.add(2);
		arrayList.add(2);
		arrayList.add(1);
		arrayList.add(4);
		arrayList.add(4);
		arrayList.add(4);
		arrayList.add(4);
		arrayList.add(1);
		arrayList.add(1);
		arrayList.add(5);
		arrayList.add(5);
		arrayList.add(5);
		arrayList.add(5);
		arrayList.add(5);
		arrayList.add(1);
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.addAll(arrayList);
		arrayList.clear();
		arrayList.addAll(lhs);
		System.out.println(arrayList);
	}

	private static void demo2() {
//		ʹ��Scanner�Ӽ��̶�ȡһ������,ȥ�������ظ��ַ�, ��ӡ����ͬ����Щ�ַ�/
		Scanner in =new Scanner(System.in);
		String s=in.nextLine();
		LinkedHashSet<Character> lhs=new LinkedHashSet<>();
		char[] arr=s.toCharArray();
		for(int i=0;i<s.length();i++){
			lhs.add(arr[i]);
			s.charAt(i);
		}
		System.out.println(lhs.toString());
	}

	private static void demo1() {
//		��дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ����������յ���������������̨��
		HashSet<Integer> hs=new HashSet<>();
		Random s=new Random();
		
		while(hs.size()<=10){
			int x=s.nextInt(20)+1;
			hs.add(x);
		}
		System.out.println(hs);
	}
}
