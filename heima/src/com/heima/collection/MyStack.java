package com.heima.collection;

import java.util.LinkedList;

public class MyStack {
	private LinkedList  list =new LinkedList();
	
	/*模拟进栈*/
	public void push(Object obj){
		 list.addFirst(obj);
	}
	
	/*模拟出栈*/
	public Object pop(){
		return list.removeFirst();
	}
	
	/*模拟栈是否为空*/
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public int size(){
		return list.size();
	}

}
