package com.Ploymorphism2;

public class Ploymorphism3 {
   class A{//����
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
   class B extends A{//����
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
		Ploymorphism3.A a=p.new B();//����ת��
        a.fun1();
        Ploymorphism3.A c=p.new B();
        Ploymorphism3.B b=(B)c;//����ת��
        b.fun4();
	}

}
