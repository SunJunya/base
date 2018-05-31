package com.heima.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList {
	public static void main(String[] args) {
//		LinkedList<E>  //extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, java.io.Serializable
//		ArrayList<E> //extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable
//		TreeSet<E>   //extends AbstractSet<E> implements NavigableSet<E>, Cloneable, java.io.Serializable
//		HashSet<E>   // extends AbstractSet<E>  implements Set<E>, Cloneable, java.io.Serializable
//		Demo1();
		
//		demo3();
		
//		List oldlist = new ArrayList<>();
//		deleterepeat(oldlist);
		
//		demo4();
		demo5();
		List<String> list = new ArrayList<>();
		System.out.println();
	}

	private static void demo5() {
		System.out.println("99999999999");
		ArrayList<String> list =new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		String[] strings=list.toArray(new String[1]);
	}

	private static void demo4() {
		/*去除ArrayList中自定义元素对象的重复值
		 * 定义同名同年龄为重复值
		 * 需要重写Student的equals()方法
		 * */
		List<Student> oldstulist=new ArrayList<>();
		oldstulist.add(new Student("张三",21));
		oldstulist.add(new Student("张三",22));
		oldstulist.add(new Student("张四",21));
		oldstulist.add(new Student("张四",21));
		oldstulist.add(new Student("王五",21));
		oldstulist.add(new Student("赵六",21));
		System.out.println(oldstulist);
		List<Student> newstulist=new ArrayList<>();
		Iterator<Student> stuit=oldstulist.iterator();
		while (stuit.hasNext()) {
			Student s=stuit.next();
//			if(!newstulist.contains(s)){
//				//contains方法依赖的是equals方法
//				newstulist.add(s);
//			}
			System.out.println(stuit.next().getName());
			
		}
		System.out.println(newstulist);
	}

	private static void deleterepeat(List oldlist) {
		/*去除ArrayList中重复字符串元素*/
	
		oldlist.add(1);
		oldlist.add(2);
		oldlist.add(3);
		oldlist.add(2);
		oldlist.add(4);
		oldlist.add(3);
		System.out.println(oldlist);
		
		List newlist = new ArrayList<>();
		Iterator oldit=oldlist.iterator();
		while(oldit.hasNext()){
			//要用object接收对象，，next()方法每运行一次，指针往后移一个位置
			Object object=oldit.next();
			if(!newlist.contains(object)){
				newlist.add(object);
			}
		}
		System.out.println(newlist);
	}

	private static void demo3() {
		StringBuffer cString=null;
		List list=new ArrayList();
		list.add("a");//放入字符串自动提升成object
		list.add("c");
		list.add("world");		
		list.add("b");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		/*Iterator it=list.iterator();
		while(it.hasNext()){
			String str=(String)it.next();  
			
//			java.util.ConcurrentModificationException
//			并发修改异常，当方法监测到对象的并发修改，但不允许这种修改时，抛出此异常
			
			if("world".equals(str)){
				list.add("javaee");
			}
			//遍历的同时在增加元素，并发修改ConcurrentModificationException
		}*/
		System.out.println(list.size());
		ListIterator lit=list.listIterator();
		while(lit.hasNext()){
			String str=(String)lit.next();
			if("d".equals(str)){
				lit.add("javaee");
			}
		}
		System.out.println(list.size());
		System.out.println(list);
	}

	private static void Demo1() {
		List list =new ArrayList();
		list.add(111);
		list.add(123);
		list.add(234);
		list.remove(new Integer(111));
		System.out.println(list);
	}
}
