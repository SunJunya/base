package six.object;

public class Person {
	private String name;
	private int age;
	public  Person(String name ,int age){
		this.name=name;
		this.age=age;
	}
	public boolean equals(Object object){
		if(this==object) return true;
		if(!(object instanceof Person)) return false;
		Person person=(Person)object;
		if(person.name.equals(this.name)&&person.age==this.age) return true;
		else return false;
	}
	
	public String toString(){
		return "–’√˚£∫"+this.name+"£ªƒÍ¡‰£∫"+this.age;
	}
	
	public static void main(String args[]){
		Person person1=new Person("suliya",29);
		Person person2=new Person("suliya", 29);
		System.out.println(person1.equals(person2)?"the same!":"isn't same!");
		System.out.println(person1.equals("hello")?"the same!":"isn't same!");
		
	}
}
