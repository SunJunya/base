package com.exception;


public class Exception {
//    public static void main(String args[]){
//    	System.out.println("*********************");
//    	int i=10;
//    	int j=0;
//    	try{
//    		int temp=i/j;
//    		System.out.println("the result:"+temp);
//    		System.out.println("------------------");
//    	}catch (ArithmeticException e) {
//			// TODO: handle exception
//    		System.out.println("出现了异常："+e);
//    		//e.printStackTrace();
//		}finally{
//			System.out.println("不管是否异常，都运行此段代码");
//		}
//    	System.out.println("******计算结束******");    	 
//    }
	
	
	public static void main(String args[]){
        System.out.println("*********begin********");
        int i=10;
        int j=2;
        try {
			String str1=args[0];
			String str2=args[1];
			i=Integer.parseInt(str1);
			j=Integer.parseInt(str2);
			int temp=i/j;
			System.out.println("两数相除的结果："+temp);
			System.out.println("-------------------");
			} catch (ArithmeticException e) {
			// TODO: handle exception
				System.out.println("出现异常："+e);
				e.printStackTrace();
		}
        System.out.println("--计算结束！--");
	}
}
