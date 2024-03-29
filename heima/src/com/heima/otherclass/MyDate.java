package com.heima.otherclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MyDate {
	/*
	 * 算一算你来到世界多少天
	 * 1、将生日日期字符串和今天字符串存在Stirng类型的变量中
	 * 2、定义日期格式化对象
	 * 3、将日期字符串转换成日期对象
	 * 4、通过日期对象获取时间毫秒值
	 * 5、将两个时间毫秒值相减
	 * */
	
	public static void main(String[] args) throws ParseException {
//		demo1();
//		demo2();
//		demo4();
		
		
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String date=in.nextLine();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
			Date d =sdf.parse(date);
			Calendar c=Calendar.getInstance();
			c.setTime(d);
			c.add(Calendar.DAY_OF_MONTH, 2);
			System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DAY_OF_MONTH)+"日");
		}
		
		
		
		
		
	}

	private static void demo4() {
		/*键盘录入任意一个年份，判断是否是闰年
		 * 
		 * 1、键盘录入年分，通过判断二月是否是29天
		 * 2、通过set方法设置为那一年的3月1日
		 * 3、将日向前减一天，判断日是多少天
		 * */
		Scanner in =new Scanner(System.in);
		System.out.println("输入年份，判断该年份是闰年还是平年");
//		int year=in.nextInt();
		String year=in.nextLine();
		
		
		Calendar  c=Calendar.getInstance();
		c.set(Integer.valueOf(year), 2, 1);//三月1日
		c.add(Calendar.DAY_OF_MONTH, -1);
		
		if(c.get(Calendar.DAY_OF_MONTH)==29){
			System.out.println("今年是闰年");
		}else {
			System.out.println("今年是平年");
		}
	}

	private static void demo2() {
		Date d1=new Date(0);
		System.out.println(d1);
		d1.setTime(12);
		System.out.println(d1.getTime());
	}

	private static void demo1() {
		String bir="1997年10月09日 ";
		String today="2088年06月06日";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
		
		try {
			Date d1=sdf.parse(bir) ;
			Date d2=sdf.parse(today);
			long time =d2.getTime()-d1.getTime();//获取两时间毫秒值差
			System.out.println(time/1000/60/60/24/365);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}
	
	private static void calendarDemo1() {
		Calendar c=Calendar.getInstance();
		Calendar c2=Calendar.getInstance();
		
		SimpleDateFormat  sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		
		Date d1=c.getTime();
		System.out.println(sdf.format(d1));
		
		
		
		Date d2=c2.getTime();
		System.out.println(sdf.format(d2));
	}
}
