package Inner;
/*实现接口
 * */
 interface Person2 {
	 public void eat();
}
 class Child implements Person2{
	 public void eat() {
		System.out.println("eat something");
	}
 }
 
public class Demo2{
	 public static void main(String[] args){
		 Person2 person=new Child();
		 person.eat();
	 }
 }
