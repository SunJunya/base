package com.heima.thread;

import java.util.HashMap;
import java.util.Hashtable;

class Printer{
	String s="a";
	public void printer1(){
		synchronized (s) {
			System.out.print("孙");
			System.out.print("孙");
			System.out.print("孙");
			System.out.print("孙");
			System.out.print("孙");
			System.out.print("孙");
			System.out.print("\r\n");
		}
		
	}
	
	public void printer2() {
		synchronized (s) {
			System.out.print("君");
			System.out.print("君");
			System.out.print("君");
			System.out.print("君");
			System.out.print("君");
			System.out.print("\r\n");
		}
	}
}

class Ticket implements Runnable{
	int tickets=20;

	@Override
	public void run() {
		while(true){
			synchronized(Ticket.class){
				if(tickets<=0){
					break;
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"  第"+tickets--+"张票");
			}
		}
	}
}

class Ticket2 extends Thread{
	private static int tickets=20;

	@Override
	public void run() {
		while(true){
			synchronized(Ticket.class){
				if(tickets<=0){
					break;
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"  第"+tickets--+"张票");
			}
		}
	}
}
public class MyThreads {
	public static void main(String[] args) {
//		demo1();
//		demo2();
//		demo3();同步代码块
		/*Ticket ticket =new Ticket();
		new Thread(ticket).start();
		new Thread(ticket).start();
		new Thread(ticket).start();
		new Thread(ticket).start();
		new Thread(ticket).start();	*/
		StringBuilder s1;
		StringBuffer s2;
		HashMap<String, String>  hm;
		Hashtable<String, String>  ht;
 		
//		demo4();//继承thread实现资源共享
		
	}

	private static void demo4() {
		new Ticket2().start();
		new Ticket2().start();
		new Ticket2().start();
		new Ticket2().start();
	}

	private static void demo3() {
		final Printer p =new Printer();
		new Thread(){
			public void run() {
				while(true){
					p.printer1();
				}
			}
		}.start();
		
		new Thread(){
			public void run() {
				while(true){
					p.printer2();
				}
			}
		}.start();
	}

	private static void demo2() {
		new Thread(){
			public void run() {
				for(int i=0;i<1000;i++){
					System.out.println("我是使用匿名内部类实现线程基础Thread类");
				}
			}
		}.start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<1000;i++){
					System.out.println("我是使用匿名内部类实现Runnable接口的线程");
				}
			}
		}).start();;
		
		for(int i=0;i<1000;i++){
			System.out.println("我是main方法线程");
		}
	}

	private static void demo1() {
		MyThread1 my1=new MyThread1();
		my1.start();
		
		Runnable rmy2 = new MyThread2();
		Thread my2 = new Thread(rmy2);
		my2.start();
		
		for(int i=0;i<1000;i++){
			System.out.println("我是main方法线程");
		}
	}
}

class MyThread1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<1000;i++){
			System.out.println("我是继承的Thread类的线程");
		}
	}
}

class MyThread2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<1000;i++){
			System.out.println("我是实现Runnable接口的线程");
		}
	}
	
}

