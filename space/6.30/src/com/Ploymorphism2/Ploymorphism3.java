package com.Ploymorphism2;

public class Ploymorphism3 {
   class A{//父类
	   public void fun1(){
		   System.out.println("A--fun1");
	   }
	   public void fun2(){
		  this.fun1(); 
	   }
	   public void fun4(){
		   System.out.println("A--fun4");
	   }
   }
   class B extends A{//子类
	   public void fun1(){
		   System.out.println("B--fun1");
	   }
	   public void fun3(){
		   System.out.println("B--fun3");
	   }
   }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ploymorphism3 p=new Ploymorphism3();
		Ploymorphism3.A a=p.new B();//向上转型
        a.fun1();
        Ploymorphism3.A c=p.new B();
        Ploymorphism3.B b=(B)c;//向下转型
        b.fun4();
	}

}
