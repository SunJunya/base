package com.datanext;

 
public class Datanext{
	public static void main(String[] args) {
	     Re l=new Re();
	     l.addNode("A");
	     l.addNode("B");
	     l.addNode("C");
	     l.addNode("D");
	     l.addNode("E");
	     System.out.println("删除之前");
	     l.printNode();
	     l.deleteNode("C");
	     l.deleteNode("D");
	     System.out.println();
	     System.out.println("删除之后");
	     l.printNode();
	     System.out.println();
	     System.out.println("查询节点："+l.contains("A"));
	    
	}
      
	
}
