package com.usb;

interface USB{
	public void start();
	public void stop();
}

class Computer{
	 public static void plugin(USB usb){
		 usb.start();
		 System.out.println("=====USB设备工作=====");
		 usb.stop();
	 }
}

class Flash implements USB{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("u盘 start to work");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("u盘 stop to work\n");
		
	}
	
}

class Print implements USB{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("打印机start to work");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("打印机 stop to work\n ");
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
