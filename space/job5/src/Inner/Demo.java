package Inner;
/*
 * �̳г�����
 * */
 abstract class Person {
	public abstract void eat();
}

 class kids extends Person{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat something");
	}
	
}
 
 public class Demo{
	 public static void  main(String[] args) {
		Person person=new kids();
		person.eat();

	}
 }
 
 
  
 
