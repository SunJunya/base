package six.four.two;

abstract class A{
	public abstract void printA();
	interface B{
		public void printB();
	}
};
class X extends A{
	public void printA(){
		System.out.println("HELLO--A");
	}
	class Y implements B{
		public void printB(){
			System.out.println("HELLO--B");
		}
	};
	
};

public class InnerExtDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       A.B b=new X().new Y();
       b.printB();
	}

}
