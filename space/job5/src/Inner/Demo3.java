package Inner;
/*
 * ÄÚ²¿Àà
 * */
public class Demo3 {
	public static void  mian() {
		Person3 person3=new Person3();
		Person3.Kids kids=person3.new Kids();
		kids.eat();
	}
	
}

class Person3{
	class Kids{
	   public void  eat() {
		System.out.println("eat something");
	}
	}
	
}
