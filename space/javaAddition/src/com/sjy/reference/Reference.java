package com.sjy.reference;

class Demo{
	String temp="hello";
}

public class Reference {

	public static void main(String[] args) {
		test1();
//		test2();

	}

	private static void test2() {
		String str="hello";
		System.out.println(str);
		fun2(str);
		System.out.println(str);
	}

	private static void fun2(String str) {
		str="MLDN";
		
	}

	private static void test1() {
		Demo demo=new Demo();
		System.out.println(demo.temp);
		demo.temp="world";
		System.out.println(demo.temp);
		fun1(demo);
		System.out.println(demo.temp);
	}

	private static void fun1(Demo demo) {
		demo.temp="MLDN";
		
	}
	/*The String class is the final class. If the transfer object is of type String, 
	 * its value cannot be changed, only a new object will be created. 
	 * If the passed object is a custom object, the String property of the object 
	 * will be changed in the method. , you can change the value of String.*/
	

}
