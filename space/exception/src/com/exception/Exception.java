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
//    		System.out.println("�������쳣��"+e);
//    		//e.printStackTrace();
//		}finally{
//			System.out.println("�����Ƿ��쳣�������д˶δ���");
//		}
//    	System.out.println("******�������******");    	 
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
			System.out.println("��������Ľ����"+temp);
			System.out.println("-------------------");
			} catch (ArithmeticException e) {
			// TODO: handle exception
				System.out.println("�����쳣��"+e);
				e.printStackTrace();
		}
        System.out.println("--���������--");
	}
}
