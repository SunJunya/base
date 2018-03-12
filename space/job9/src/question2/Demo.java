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
	int num;//�������Ե�̨�� 
    boolean flag;
	public ComputerInfo(boolean flag) {
		super();
		this.num = 0;
		flag = false;
	}
	
	public synchronized void MakeCompuer() {
		//��������
		if(!flag) {
			//����һ̨����
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("��������"+ ++num+"̨����");
			flag = true;		//���԰���
			notifyAll();
			//return true;
		}else {
			try {
				Thread.currentThread().wait();  //�����û������
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public synchronized void ConveyComputer() {
		if(flag) {
			//����һ̨����
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("����һ̨����");
			flag = false;		//���԰���
			notifyAll();
			//return true;
		}else {
			try {
				Thread.currentThread().wait();  //�����û������
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
