package com.heima.faceObject;

public class Extends {

	public static void main(String[] args) {
		Person p=new Student();
		System.out.println(p.getClass().getName());
	}

}


class Person{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void eating(){
		System.out.println("��Ҫ�Է�");
	}
	
	
		
}

class Student extends Person{
	
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super(name, age);
	}
	public void eating(){
		this.setAge(12);
		System.out.println("ѧ��Ҫ�Է�");
	}
	public void study(){
		System.out.println("ѧ��Ҫѧϰ");
		
	}
}

class Teacher extends Person{
	
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public void eating(){
		System.out.println("ѧ��Ҫ�Է�");
	}
	public void teach(){
		System.out.println("��ʦҪ����");
	}
}