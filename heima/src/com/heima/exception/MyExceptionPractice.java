package com.heima.exception;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class MyExceptionPractice {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个整数");
		
		while(true){
			String line = in.nextLine();
			try {
				int num = Integer.parseInt(line);
				System.out.println(Integer.toBinaryString(num));
				break;
			} catch (Exception e) {
				try {
					new BigInteger(line);
					System.out.println("录入错误您录入的整数过大，请重新录入：");
				} catch (Exception e2) {
					try {
						new BigDecimal(line);
						System.out.println("录入错误，您录入的是一个小数，请重新录入：");
					} catch (Exception e1) {
						System.out.println("您录入的是一个非法字符，请重新输入：");
					}
				}
			}
		}
	}
}
