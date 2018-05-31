package com.github.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Interrupted {
	public static void main(String[] args) {
//		demo1();
		
//		demo2();

		ExecutorService es = Executors.newCachedThreadPool();
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		});
		es.shutdownNow();
		System.out.println("main run");
	}

	private static void demo2() {
		
		Thread t2 = new InterruptThread2();
		t2.start();
		
		t2.interrupt();
	}

	private static void demo1() {
		/**
		 * 当前线程处于阻塞，等待状态下，调用interrupt()方法会抛出异常*/
		Thread t1 = new InterruptThread1();
		t1.start();
		t1.interrupt();
	}
}

class InterruptThread1 extends Thread{
	public void run(){
		try {
			while(true){
				Thread.sleep(100);
				System.out.println("1234");
			}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}



class InterruptThread2 extends Thread{
	public void run(){

		while(!interrupted()){
			System.out.println("1234");
		}
		System.out.println("thread end");
		
	}
}


class InterruptThread3 extends Thread{
	public void run(){

		while(true){
			System.out.println("1234");
		}
		
	}
}