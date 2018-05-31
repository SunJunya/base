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
		//当compareTo()方法返回0时，只有一个元素
		//当compareTo()方法返回正数时，集合怎么存，怎么取
		//当compareTo()方法返回负数时，集合倒叙存储
		TreeSet<Student> ts=new TreeSet<>();
		ts.add(new Student("张三",21));
		ts.add(new Student("赵六",24));
		ts.add(new Student("李四",22));
		ts.add(new Student("王五",23));
		ts.add(new Student("张三",21));
		ts.add(new Student("李四",22));
		System.out.println('张'+0);
		System.out.println('李'+0);
		System.out.println('王'+0);
		System.out.println('赵'+0);
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
