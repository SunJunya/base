package com.heima.collection;

public class Student implements Comparable<Student>{
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
		
	}
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
	@Override
	public boolean equals(Object obj) {
		Student s=(Student)obj;
		
		
		return this.getName().equals(s.getName())  && this.getAge()==s.getAge();
	}
	
	
	@Override
	/*//��������Ƚ�
	public int compareTo(Student o) {
		int num=this.age-o.age;
		return num==0?this.name.compareTo(o.name):num;
	}*/
	
	//���������Ƚ�
	/*public int compareTo(Student o) {
		int num=this.name.compareTo(o.name);
		return num==0?this.age-o.age:num;
	}*/
	
	//�����������ȱȽ�
	public int compareTo(Student o) {
		int length=this.name.length()-o.name.length();
		int num=length==0?this.name.compareTo(o.name):length;
		return num==0?this.age-o.age:num;
	}
	
	
}
