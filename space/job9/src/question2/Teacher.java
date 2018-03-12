package question2;

import org.omg.CORBA.PRIVATE_MEMBER;

class Product implements Runnable{
	private boolean flag;
	private int num;
	private int box=0;
	
	
	public Product(boolean flag) {
		super();
		this.flag = flag;
	}


	public boolean isFlag() {
		return flag;
	}


	public void setFlag(boolean flag) {
		this.flag = flag;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public int getBox() {
		return box;
	}


	public void setBox(int box) {
		this.box = box;
	}


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(boolean flag, int num, int box) {
		super();
		this.flag = flag;
		this.num = num;
		this.box = box;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(flag&&box==0) {
	         this.setNum(getNum()+1);
	         System.out.println("当前电脑数量为："+getNum()+"  "+getBox());
	         setBox(this.box+1);
	         System.out.println("当前工具箱中的电脑为："+getBox());
	         
		}
		else Thread.currentThread().yield();
	}	
};
class Carry implements Runnable{
	int box;
	public Carry(Product product) {
		super();
		this.box=product.getBox();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(box==1) {			
			System.out.println("carry当前工具箱中的电脑为："+this.box);
		}
		else  {
			Thread.currentThread().yield();
			System.out.println("11111111111");
		}
	}
	
};
public class Teacher{
	public static void main(String args[]){
		Product pro = new Product(true) ;	// 生产者
		Carry carry=new Carry(pro);
		new Thread(pro).start() ;
		new Thread(pro).start() ;
		new Thread(pro).start() ;
		new Thread(carry).start();
	}
};