package com.github.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MutexAndSync {
	public static void main(String[] args) {
		/**同步关键字  synchronized(JVM实现的)
			同步一个代码块  synchronized(this){} 作用于同一个对象，如果调用两个对象上的同步代码块，就不会进行同步。
			同步一个方法 public synchronized void func(){} 可同步代码块一样，只能作用于同一个对象
			同步一个类 synchronized(Student.class)作用于整个类，也就是说这两个线程调用同一个类的不同对象上的这种同步语句，也需要进行同步。
			同步一个静态方法 public synchronized static void func(){} 作用于整个类
		*/
		
		/**ReentrantLock(JDK实现的)    java.util.concurrent包中的锁，相对于synchronized它多了以下的高级功能。
		 * 1、等待可中断
		 * 2、可实现公平锁
		 * 3、锁绑定多个条件
		 * 
		 * 
		 * 
		 * */
		
		/**
		 * synchronized和ReentrantLock的区别
		 * 	1、锁的实现
		 * 		synchronized是JVM实现，而ReentrantLock是JDK实现的
		 *  2、性能
		 *  	从性能上来看，新版本的java对synchronized进行了很多优化，例如自旋锁等。目前来讲和ReentrantLock的性能差不多，在使用时一般会优先选择synchronized
		 *  3、功能
		 *  	ReentrantLock多了一些高级功能
		 *  4、使用选择
		 *  	除非需要使用ReentrantLock的高级功能，否则优先使用synchronized。这是因为synchronized是JVM实现的一种锁机制，JVM原生地支持它，
		 *  	而ReentrantLock不是所有的JDK版本都支持。并且使用synchronized不用担心没有释放锁而导致死锁问题，因为JVM会确保锁的释放
		 * */
		final LockExample le = new LockExample();
		ExecutorService es = Executors.newCachedThreadPool();
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				le.fun();
			}
		});
		
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				le.fun();
			}
		});
		
	}
}

class LockExample{
	private Lock lock = new ReentrantLock();
	public void fun(){
		lock.lock();
		try {
			for(int i=0;i<10;i++){
				System.out.println(i+" ");
			}
		} finally {
			lock.unlock();//确保释放锁，从而避免发生死锁
		}
	}
}