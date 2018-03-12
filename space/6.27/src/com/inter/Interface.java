package com.inter;

//接口的多继承
public class Interface {
interface A{
	public String AUTHOR="孙君雅";
	public void printA();
}
interface B{
	public void printB(); 
}
interface C extends A,B{
	public void  printC(); 		
}
 class X implements C{

	public void printA() {
		// TODO Auto-generated method stub
		System.out.println("A、hello world");
	}

	public void printB() {
		// TODO Auto-generated method stub
		System.out.println("B.helloworld");
		
	}

	public void printC() {
		// TODO Auto-generated method stub
		System.out.println("C.hello world");
	}
	
}

	public static void main(String args[]) {
		Interface y=new Interface();
		Interface.X x=y.new X();//访问内部类
		x.printA();
		x.printB();
		x.printC();
		
	}
}