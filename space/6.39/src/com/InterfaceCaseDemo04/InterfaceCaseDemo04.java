package com.InterfaceCaseDemo04;

interface fruits{
	public void eat();
}

class Apple implements fruits{
	public void eat(){
		System.out.println("apple");
	}
}

class Orange implements fruits{
	public void eat(){
		System.out.println("orange");
	}
}

class factory{//过度端 接口与子类之间的过度，
	public static fruits getInstance(String className){
		fruits f=null;
		if("apple".equals(className)){
			f=new Apple();
		}
		if("orange".equals(className)){
			f=new Orange();
		}		
		return f;
	}
}

public class InterfaceCaseDemo04 {
     public static void main(String args[]){
    	 fruits f=null;
    	 f=factory.getInstance("aaa");//??
    	// if(f!=null)
    	// {
    		 f.eat();
    	// }w
     }
}
