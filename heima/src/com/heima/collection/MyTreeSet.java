package com.heima.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class MyTreeSet {
	public static void main(String[] args) {
//		demo1();
		TreeSet<String> ts=new TreeSet<>(new CompareByLen());
		ts.add("asad");
		ts.add("aaasadasd");
		ts.add("sss");
		ts.add("w");
		ts.add("asad");
		System.out.println(ts);
	}

	private static void demo1() {
		//��compareTo()��������0ʱ��ֻ��һ��Ԫ��
		//��compareTo()������������ʱ��������ô�棬��ôȡ
		//��compareTo()�������ظ���ʱ�����ϵ���洢
		TreeSet<Student> ts=new TreeSet<>();
		ts.add(new Student("����",21));
		ts.add(new Student("����",24));
		ts.add(new Student("����",22));
		ts.add(new Student("����",23));
		ts.add(new Student("����",21));
		ts.add(new Student("����",22));
		System.out.println('��'+0);
		System.out.println('��'+0);
		System.out.println('��'+0);
		System.out.println('��'+0);
		System.out.println(ts);
	}
}

class CompareByLen implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		int num=o1.length()-o2.length();
		
		return num==0?o1.compareTo(o2):num;
	}
	
}
