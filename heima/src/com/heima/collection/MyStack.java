package com.heima.collection;

import java.util.LinkedList;

public class MyStack {
	private LinkedList  list =new LinkedList();
	
	/*ģ���ջ*/
	public void push(Object obj){
		 list.addFirst(obj);
	}
	
	/*ģ���ջ*/
	public Object pop(){
		return list.removeFirst();
	}
	
	/*ģ��ջ�Ƿ�Ϊ��*/
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public int size(){
		return list.size();
	}

}
