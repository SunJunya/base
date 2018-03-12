package com.Ploymorphism2;

public class Ploymorphism2 {
	class A{
		 public void fun1(){
			 System.out.println("A-public void fun1");
		 }
		 public void fun2(){
			 System.out.println("A-public void fun2");		
		}
	}
	class B extends A{
		 public void fun1(){
			 System.out.println("A-public void fun1");
		 }
		 public void fun3(){
			 System.out.println("A-public void fun3");		
		}
	}
	class C extends A{
		 public void fun1(){
			 System.out.println("A-public void fun1");
		 }
		 public void fun5(){
			 System.out.println("A-public void fun5");		
		}
	}
     
     public static void main(String[] args) {
    	 Ploymorphism2 a=new Ploymorphism2();
    	// Ploymorphism2.B b=;
    	// Ploymorphism2.C c=;
          fun(a.new B());//访问内部类
          fun(a.new C());
        
	}
     public static void fun(B b) {
		b.fun1();
	}
     public static void fun(C c) {
 		c.fun1();
 	}
     
}
