package com.Abstract;

public class Abstract {
	public static void main(String[] args) {
        Student stu =new Student("suliya", 12, "university");
        System.out.println(stu.getlnfo());
	}

}

abstract class Person{
	private String name;
	private int age;
	public  Person(String name,int age){
		this.setName(name);
		this.setAge(age);
	}
	public int  getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
    public void setAge(int  age){
        this.age=age;		
	}
    public abstract String getlnfo();//���󷽷���ȡ����Ϣ
    /*
     * ��������뱻����̳У�������븲д�������е����г��󷽷�*/
}

 class Student extends Person{

	private String school;
	public Student(String name, int age,String school) {
		super(name, age);
		this.setSchool(school);
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school=school;
	}
	public String getlnfo(){
		return "������"+super .getName()+
				";\n���䣺"+super.getAge()+
				"��\nѧУ��"+this.getSchool();
		
	}
}
