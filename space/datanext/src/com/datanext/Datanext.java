package com.datanext;

 
public class Datanext{
	public static void main(String[] args) {
	     Re l=new Re();
	     l.addNode("A");
	     l.addNode("B");
	     l.addNode("C");
	     l.addNode("D");
	     l.addNode("E");
	     System.out.println("ɾ��֮ǰ");
	     l.printNode();
	     l.deleteNode("C");
	     l.deleteNode("D");
	     System.out.println();
	     System.out.println("ɾ��֮��");
	     l.printNode();
	     System.out.println();
	     System.out.println("��ѯ�ڵ㣺"+l.contains("A"));
	    
	}
      
	
}
