package com.heima.collection;

import java.util.LinkedList;

public class MyLinkedList {
	public static void main(String[] args) {
//		demo1();

	}

	private static void demo1() {
		/*用LinkedList模拟栈结构
		 * */ 
		LinkedList lList=new LinkedList<>();
		lList.addFirst("a");
		lList.addFirst("b");
		lList.addFirst("c");
		lList.addFirst("d");
		lList.addFirst("e");
		lList.addFirst("f");
		while(!lList.isEmpty()){
			System.out.println(lList.removeFirst());
		}
	}
}
