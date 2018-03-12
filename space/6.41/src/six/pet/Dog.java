package six.pet;

public class Dog implements Pet {
	private String name;
	private String color;
	private int age;
	public Dog(String name,String color,int age){
		this.setName(name);
		this.setColor(color);
		this.setAge(age);
	}
	private void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}
	private void setColor(String color){
		this.color=color;
	}
	public void setAge(int age){
		this.age=age;
	}

	public String getName() {
		return this.name;
	}
	public String getColor(){
		return this.color;
	}
	public int getAge() {
		return this.age;
	}

};
