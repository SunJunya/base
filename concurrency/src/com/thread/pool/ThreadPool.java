package com.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

import org.eclipse.jdt.internal.compiler.apt.model.Factory;

public class ThreadPool {
	public static void main(String[] args) {
//		cachePoolThread();
//		fixedPoolThread();
		int corePoolSize=2;
		ExecutorService scheduled = Executors.newScheduledThreadPool(corePoolSize);
		
		ExecutorService single = Executors.newSingleThreadExecutor();
	}

	private static void fixedPoolThread() {
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2);
		
		MyRunnable1 r1 = new MyRunnable1();
		MyRunnable2 r2 = new MyRunnable2();
		MyRunnable3 r3 = new MyRunnable3();
		
		fixedThreadPool.submit(r1);
		fixedThreadPool.submit(r2);
		fixedThreadPool.submit(r3);
		
		fixedThreadPool.shutdown();
	}

	private static void cachePoolThread() {
		MyRunnable1 runnable = new MyRunnable1();
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		cachedThreadPool.submit(runnable);
		cachedThreadPool.shutdown();
	}
}


class MyRunnable1 implements Runnable{

	@Override
	public void run() {
		int i=0;
		while(i<20){
			System.out.println("1111111");
			i++;
		}
	}
	
}

class MyRunnable2 implements Runnable{

	@Override
	public void run() {
		int i=0;
		while(i<50){
			System.out.println("222222");
			i++;
		}
	}
	
}


class MyRunnable3 implements Runnable{

	@Override
	public void run() {
		int i=0;
		while(i<20){
			System.out.println("33333");
			i++;
		}
	}
	
}
