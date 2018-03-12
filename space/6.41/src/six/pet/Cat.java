package six.pet;

public class Cat implements Pet {
	private String name;
	private String color;
	private int age;
	public Cat(String name,String color,int age)
	{
		this.setName(name);
		this.setColor(color);
		this.setAge(age);
	}
	public void setName(String name){
		this.name=name;
	}
	public void setColor(String color){
		this.color=color;
	}
	public void setAge(int age){
		this.age=age;
	}
	 public String getName(){
		 return null;
		 
	 }
	 public String getColor(){
		return null;
		 
	 }
	 public int getAge(){
		return 0;
		 
	 }
}
