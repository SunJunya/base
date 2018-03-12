package com.Extend;

import java.awt.im.InputContext;
import java.awt.print.Printable;
import java.util.Scanner;

public class Extend {
		/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("输入数组总长度");
		int m=input.nextInt();
		ReverseARRAry a=new ReverseARRAry(m);
		for (int i = 0;i<m;i++){
			System.out.println("输入数据");
			int n=input.nextInt();
			a.add(n);
		}
	    print(a.getArrary());
	    System.out.println("输入数组总长度");
	    int l_ength=input.nextInt();
	    sortArrary b=new sortArrary(l_ength);
	    for (int i = 0;i<l_ength;i++){
			System.out.println("输入数据");
			int n=input.nextInt();
			b.add(n);
		}
	    print(b.getArrary());
	}
	public static void print(int x[]) {
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]+"   ");
			
		}
	}

}
