package com.sjy.thisKey;

class Person{
	private String name;
	private Integer age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
		
		//output:Person [name=sjy, age=21]
	}
	
	/*public Person(String name, Integer age) {
		super();
		name = name;
		age = age;
		
//		output:Person [name=null, age=null]
	}*/
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class ThisKey {

	public static void main(String[] args) {
		Person person=new Person("sjy",new Integer(21));
		System.out.println(person);
	}
	
	/*If you do not use the this keyword in the constructor, 
	 * and the parameter name passed in is the same as the parameter name of the property, 
	 * the constructor will use the nearest principle, 
	 * and the references on both sides of the equal sign are the parameter references passed in the method.*/
	

}
