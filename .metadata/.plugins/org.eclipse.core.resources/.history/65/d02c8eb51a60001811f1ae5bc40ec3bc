package com.test;

public class ThreeThread {
	public static void main(String[] args) {
		final Print1 p1 = new Print1();
 		new Thread(){
			public void run(){
				while(true){
					try {
						p1.print1();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		
		new Thread(){
			public void run(){
				while(true){
					try {
						p1.print2();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		
		
		new Thread(){
			public void run(){
				while(true){
					try {
						p1.print3();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
}


class Print1{
	private int flag = 1;
	public  void print1() throws InterruptedException {
		synchronized (Print.class) {
			while (flag!=1) {
				Print.class.wait();
			}
			System.out.print("ºÚ");
			System.out.print("Âí");
			System.out.print("³Ì");
			System.out.print("Ðò");
			System.out.print("Ô±");
			System.out.print("\r\n");
			flag=2;
			Print.class.notifyAll();
		}
		
	}
	
	public  void print2() throws InterruptedException {
		synchronized (Print.class) {
			while(flag!=2){
				Print.class.wait();
			}
			System.out.print("1");
			System.out.print("1");
			System.out.print("1");
			System.out.print("1");
			System.out.print("1");
			System.out.print("\r\n");
			flag=3;
			Print.class.notifyAll();
		}
		
	}
	
	public  void print3() throws InterruptedException {
		synchronized (Print.class) {
			while(flag!=3){
				Print.class.wait();
			}
			System.out.print("3");
			System.out.print("3");
			System.out.print("3");
			System.out.print("3");
			System.out.print("3");
			System.out.print("\r\n");
			flag=1;
			Print.class.notifyAll();
		}
		
	}
}