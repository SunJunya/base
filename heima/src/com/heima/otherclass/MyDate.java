package com.heima.otherclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MyDate {
	/*
	 * ��һ�����������������
	 * 1�������������ַ����ͽ����ַ�������Stirng���͵ı�����
	 * 2���������ڸ�ʽ������
	 * 3���������ַ���ת�������ڶ���
	 * 4��ͨ�����ڶ����ȡʱ�����ֵ
	 * 5��������ʱ�����ֵ���
	 * */
	
	public static void main(String[] args) throws ParseException {
//		demo1();
//		demo2();
//		demo4();
		
		
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String date=in.nextLine();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd��");
			Date d =sdf.parse(date);
			Calendar c=Calendar.getInstance();
			c.setTime(d);
			c.add(Calendar.DAY_OF_MONTH, 2);
			System.out.println(c.get(Calendar.YEAR)+"��"+(c.get(Calendar.MONTH)+1)+"��"+c.get(Calendar.DAY_OF_MONTH)+"��");
		}
		
		
		
		
		
	}

	private static void demo4() {
		/*����¼������һ����ݣ��ж��Ƿ�������
		 * 
		 * 1������¼����֣�ͨ���ж϶����Ƿ���29��
		 * 2��ͨ��set��������Ϊ��һ���3��1��
		 * 3��������ǰ��һ�죬�ж����Ƕ�����
		 * */
		Scanner in =new Scanner(System.in);
		System.out.println("������ݣ��жϸ���������껹��ƽ��");
//		int year=in.nextInt();
		String year=in.nextLine();
		
		
		Calendar  c=Calendar.getInstance();
		c.set(Integer.valueOf(year), 2, 1);//����1��
		c.add(Calendar.DAY_OF_MONTH, -1);
		
		if(c.get(Calendar.DAY_OF_MONTH)==29){
			System.out.println("����������");
		}else {
			System.out.println("������ƽ��");
		}
	}

	private static void demo2() {
		Date d1=new Date(0);
		System.out.println(d1);
		d1.setTime(12);
		System.out.println(d1.getTime());
	}

	private static void demo1() {
		String bir="1997��10��09�� ";
		String today="2088��06��06��";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd��");
		
		try {
			Date d1=sdf.parse(bir) ;
			Date d2=sdf.parse(today);
			long time =d2.getTime()-d1.getTime();//��ȡ��ʱ�����ֵ��
			System.out.println(time/1000/60/60/24/365);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}
	
	private static void calendarDemo1() {
		Calendar c=Calendar.getInstance();
		Calendar c2=Calendar.getInstance();
		
		SimpleDateFormat  sdf=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		
		Date d1=c.getTime();
		System.out.println(sdf.format(d1));
		
		
		
		Date d2=c2.getTime();
		System.out.println(sdf.format(d2));
	}
}
