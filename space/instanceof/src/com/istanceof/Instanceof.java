package com.istanceof;
//instanceof �����ж�һ�����󵽵����ĸ����ʵ��
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
		Instanceof.A a=i.new B();//����ת�� ����װ���ɸ���
		a.fun2();
		Instanceof.A c=i.new B();
		Instanceof.B b=(B)c;//����ת��  ����װ��������
	    b.fun3();
	    
	    System.out.println("A a=new B():"+(a instanceof A));
	    System.out.println("A a=new B():"+(a instanceof B));
	    
	    System.out.println("B b=(B)c:"+(b instanceof A));
	    System.out.println("B b=(B)c:"+(b instanceof B));
	    
	    System.out.println("A d=new A():"+(d instanceof A));
	    System.out.println("A d=new A():"+(d instanceof B));
	    
	}
}
