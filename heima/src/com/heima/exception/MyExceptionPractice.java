package com.heima.exception;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class MyExceptionPractice {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������һ������");
		
		while(true){
			String line = in.nextLine();
			try {
				int num = Integer.parseInt(line);
				System.out.println(Integer.toBinaryString(num));
				break;
			} catch (Exception e) {
				try {
					new BigInteger(line);
					System.out.println("¼�������¼�����������������¼�룺");
				} catch (Exception e2) {
					try {
						new BigDecimal(line);
						System.out.println("¼�������¼�����һ��С����������¼�룺");
					} catch (Exception e1) {
						System.out.println("��¼�����һ���Ƿ��ַ������������룺");
					}
				}
			}
		}
	}
}
