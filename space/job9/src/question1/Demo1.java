package question1;

class MyThread implements Runnable{

	private String name;
	private int i=10;
	
	
	public MyThread(String name, int i) {
		super();
		this.name = name;
		this.i = i;
	}
	public String getName() {
		return name;
	}
	public MyThread(String name) {
		super();
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
    
	
    @Override
	public void run() {
		// TODO Auto-generated method stub
		if(this.getName()=="1"||this.getName()=="2") {
//			System.out.println(this.getName()+"result="+(this.getI()));
			System.out.println(this.getName()+"result="+(this.getI()-1));
			
		}
		else {
			System.out.println(this.getName()+"result="+(this.getI()+1));
		}
	}


	public MyThread() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
public class Demo1 {
    public static void main(String[] args) {
    	MyThread myThread1=new MyThread("1");
    	MyThread myThread2=new MyThread("2");
    	MyThread myThread3=new MyThread("3");
    	MyThread myThread4=new MyThread("4");
    	
  	
    	Thread t1=new Thread(myThread1);
    	Thread t2=new Thread(myThread2);
    	Thread t3=new Thread(myThread3);
        Thread t4=new Thread(myThread4);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
    }
}
