package com.usb;

interface USB{
	public void start();
	public void stop();
}

class Computer{
	 public static void plugin(USB usb){
		 usb.start();
		 System.out.println("=====USB�豸����=====");
		 usb.stop();
	 }
}

class Flash implements USB{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("u�� start to work");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("u�� stop to work\n");
		
	}
	
}

class Print implements USB{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("��ӡ��start to work");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("��ӡ�� stop to work\n ");
	}
	
}


public class InterfaceCaseDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer.plugin(new Flash());
		Computer.plugin(new Print());
        System.out.println("abc");
	}

}
