package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyCollection {
	@SuppressWarnings("unchecked")//没加泛型在添加数据时不检查
	public static void main(String[] args) {
//		demo1();
//		demo2();
		Collection<Student> c=new ArrayList<>();
		c.add(new Student("张三",21));
		c.add(new Student("张二",22));
		c.add(new Student("李四",23));
		c.add(new Student("王五",24));
		c.add(new Student("赵六",25));
		
		Iterator<Student> it=c.iterator();
		while(it.hasNext()){
//			System.out.println(it.next());//采用Student覆写的toString()方法进行输出
//			当集合没有指定泛型时，默认object类 
			System.out.println(it.next().getName()+"  "+it.next().getAge());
		}
	}

	private static void demo2() {
		Collection c1=new ArrayList();//父类引用指向子类对象，编译父类，运行子类
		c1.add("1");
		c1.add("2");
		c1.add("3");
		c1.add("4");
		
		Collection c2=new ArrayList();//父类引用指向子类对象，编译父类，运行子类
		c2.add("1");
		c2.add("2");
		c2.add("3");
		c2.add("4");
		
		c1.addAll(c2);
//		System.out.println(c1.size());
		
		c1.add(c2);
		System.out.println(c1.size());
		
		System.out.println();
	}

	private static void demo1() {
		/*
		 * 
		 *collection基本功能演示
		 *
			boolean add(E e)
			boolean remove(Object o)
			void clear()
			boolean contains(Object o)
			boolean isEmpty()
			int size()
		collection是一个接口，在实例化时需要使用子类
		*/
		@SuppressWarnings("rawtypes")//保存原始类型
		//在没有指定泛型时，默认object类，
		Collection c=new ArrayList();//父类引用指向子类对象，编译父类，运行子类
		boolean b1=c.add(100);
		boolean b2=c.add("abc");
		boolean b3=c.add(true);
		boolean b4=c.add(new Student("sjy",21));
		boolean b5=c.add("abc");
		System.out.println(c);
//		c.clear();
		c.add("123");
		System.out.println(c);
		
		System.out.println(c.contains("123"));
		/*
		 * ArrayList对象的add()方法返回true
		 * 
		 * ArrayList类没有重写toString()方法;
		 * AbstractCollection重写toString()方法
		 * */
	}
}
