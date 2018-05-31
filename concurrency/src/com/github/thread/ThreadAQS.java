package com.github.thread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class ThreadAQS {

	
	public static void main(String[] args)  {
//		countDown();
//		cycBarrir(totalThread);
		/**Semaphore  ���ǲ���ϵͳ�е��ź��������Կ��ƶԻ�����Դ�ķ����߳���*/
		
		Hashtable<Integer, Integer> ht = new Hashtable<>();
		Vector<Integer> v = new Vector<>();
		
		
		ArrayList arr = new ArrayList<>();	
		HashMap<Integer, Integer> hm = new HashMap<>();
		Iterator it = arr.iterator();
	}

	private static void cycBarrir(final int totalThread) {
		/**CyclicBarrier �������ƶ���̻߳���ȴ���ֻ�е�����̶߳�����ʱ����Щ�̲߳Ż����ִ��
		 * 
		 * */
		final int totalThread2 = 10;
		final CyclicBarrier cb = new CyclicBarrier(totalThread);
		ExecutorService es = Executors.newCachedThreadPool();
		for (int i = 0; i < totalThread2; i++) {
			es.execute(new Runnable() {
				
				@Override
				public void run() {
					System.out.println("before...");
					try {
						cb.await();
					} catch (InterruptedException | BrokenBarrierException e) {
						
						e.printStackTrace();
					}
					System.out.println("after");
				}
			});
		}
		es.shutdown();
	}

	private static void countDown() throws InterruptedException {
		/**CountDownLatch  ��������һ���̵߳ȴ�����߳�
		 * ά����һ��������cnt��ÿ�ε���countDown()�������ü�����-1��-��0��ʱ����Щ��Ϊ����await()���ȴ����߳̾ͻᱻ����
		 * @throws InterruptedException */
		final int totalThread = 10;
		final CountDownLatch cd = new CountDownLatch(totalThread);
		ExecutorService es = Executors.newCachedThreadPool();
		for(int i = 0 ;i < totalThread ; i++){
			es.execute(new Runnable() {
				
				@Override
				public void run() {
					System.out.println("run ....");
					cd.countDown();
				}
			});
		}
		cd.await();
		System.out.println("end");
		es.shutdown();
	}
}