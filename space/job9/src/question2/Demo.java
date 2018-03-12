package question2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Computer()).start();
	}

}

class Computer implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		ComputerInfo computer = new ComputerInfo(false);
		while(true) {
			computer.MakeCompuer();
			computer.ConveyComputer();
		}
		
	}
}

class ComputerInfo {
	int num;//生产电脑的台数 
    boolean flag;
	public ComputerInfo(boolean flag) {
		super();
		this.num = 0;
		flag = false;
	}
	
	public synchronized void MakeCompuer() {
		//生产电脑
		if(!flag) {
			//生产一台电脑
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("生产出第"+ ++num+"台电脑");
			flag = true;		//可以搬运
			notifyAll();
			//return true;
		}else {
			try {
				Thread.currentThread().wait();  //如果还没被运走
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public synchronized void ConveyComputer() {
		if(flag) {
			//搬运一台电脑
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("搬运一台电脑");
			flag = false;		//可以搬运
			notifyAll();
			//return true;
		}else {
			try {
				Thread.currentThread().wait();  //如果还没被运走
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
