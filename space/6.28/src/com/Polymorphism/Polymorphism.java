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
	    A a=new B();//���������ϵĹ�ϵ������-->����
		B b= (B)a;//����ת��
        b.fun1();//���÷�������д�ķ���
        b.fun2();//���ø���ķ���
        b.fun3();//���������Լ�����ķ���
	}

	
}
