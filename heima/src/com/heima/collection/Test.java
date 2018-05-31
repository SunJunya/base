package com.heima.collection;

public class Test {
	public static void main(String[] args) {
		MyStack ms=new MyStack();
		ms.push("a");
		ms.push("b");
		ms.push("c");
		ms.push("d");
		
		while(!ms.isEmpty()){
			System.out.println(ms.pop());
		}
	}
}
