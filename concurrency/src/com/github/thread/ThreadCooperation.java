package com.github.thread;

public class ThreadCooperation {
	public static void main(String[] args) {
		A a = new A();
		B b = new B(a);
		a.start();
		b.start();
	}
}

class A extends Thread{
	public void run(){
		System.out.println("AAA");
	}
}

class B extends Thread{
	private A a;
	B(A a){
		this.a=a;
	}
	
	public void run(){
		try {
			a.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("BBBB");
	}
}
