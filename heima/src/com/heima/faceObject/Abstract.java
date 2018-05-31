package com.heima.faceObject;

public class Abstract {

	public static void main(String[] args) {
		

	}

}

abstract class Tacher{
	private int age;
	private String  name;
	
	public Tacher(){}
	
	public Tacher(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	public void setName (String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	
	public abstract void teach();
}

class BaseTecher extends Tacher{
	public BaseTecher(){}
	
	public BaseTecher(String name,int age){
		super(name,age);
	}
	
	public void teach(){
		System.out.println("½Ì»ù´¡¿Î");
	}
}