package com.istanceof;
//instanceof 可以判断一个对象到底是哪个类的实例
public class Instanceof {
    class A{
       public void fun1(){
    	   System.out.println("A--fun1");
       }
       public void fun2(){
    	   this.fun1();
       }
    }
    class B extends A{
    	public void fun1(){
    		System.out.println("B--fun1");
    	}
    	public void fun3(){
    		System.out.println("B--fun3");
    	}
    }
    public static void  main(String[] args) {
    	System.out.println("111");
		Instanceof i=new Instanceof();
		Instanceof.A d=i.new A();
		Instanceof.A a=i.new B();//向上转型 子类装换成父类
		a.fun2();
		Instanceof.A c=i.new B();
		Instanceof.B b=(B)c;//向下转型  父类装换成子类
	    b.fun3();
	    
	    System.out.println("A a=new B():"+(a instanceof A));
	    System.out.println("A a=new B():"+(a instanceof B));
	    
	    System.out.println("B b=(B)c:"+(b instanceof A));
	    System.out.println("B b=(B)c:"+(b instanceof B));
	    
	    System.out.println("A d=new A():"+(d instanceof A));
	    System.out.println("A d=new A():"+(d instanceof B));
	    
	}
}
