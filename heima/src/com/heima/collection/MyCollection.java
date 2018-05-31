package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyCollection {
	@SuppressWarnings("unchecked")//û�ӷ������������ʱ�����
	public static void main(String[] args) {
//		demo1();
//		demo2();
		Collection<Student> c=new ArrayList<>();
		c.add(new Student("����",21));
		c.add(new Student("�Ŷ�",22));
		c.add(new Student("����",23));
		c.add(new Student("����",24));
		c.add(new Student("����",25));
		
		Iterator<Student> it=c.iterator();
		while(it.hasNext()){
//			System.out.println(it.next());//����Student��д��toString()�����������
//			������û��ָ������ʱ��Ĭ��object�� 
			System.out.println(it.next().getName()+"  "+it.next().getAge());
		}
	}

	private static void demo2() {
		Collection c1=new ArrayList();//��������ָ��������󣬱��븸�࣬��������
		c1.add("1");
		c1.add("2");
		c1.add("3");
		c1.add("4");
		
		Collection c2=new ArrayList();//��������ָ��������󣬱��븸�࣬��������
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
		 *collection����������ʾ
		 *
			boolean add(E e)
			boolean remove(Object o)
			void clear()
			boolean contains(Object o)
			boolean isEmpty()
			int size()
		collection��һ���ӿڣ���ʵ����ʱ��Ҫʹ������
		*/
		@SuppressWarnings("rawtypes")//����ԭʼ����
		//��û��ָ������ʱ��Ĭ��object�࣬
		Collection c=new ArrayList();//��������ָ��������󣬱��븸�࣬��������
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
		 * ArrayList�����add()��������true
		 * 
		 * ArrayList��û����дtoString()����;
		 * AbstractCollection��дtoString()����
		 * */
	}
}
