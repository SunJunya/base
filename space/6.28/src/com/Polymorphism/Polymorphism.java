package com.Polymorphism;

	class A{
		public void fun1() {
			System.out.println("A-->public void fun1(){}");
			
		}
		public void fun2(){
			this.fun1();
		}
	}
	class B extends A{
		public void fun1(){
			System.out.println("B-->public void fun1(){}");
		}
		public void fun3() {
			System.out.println("B-->public void fun3(){}");
		}
	}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    A a=new B();//发生了向上的关系，子类-->父类
		B b= (B)a;//向下转型
        b.fun1();//调用方法被覆写的方法
        b.fun2();//调用父类的方法
        b.fun3();//调用子类自己定义的方法
	}

	
}
