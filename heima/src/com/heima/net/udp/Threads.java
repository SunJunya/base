package com.heima.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Threads {
	//发送和接收在一个窗口完成
	public static void main(String[] args) {
		Recive2 recive = new Recive2();
		Send2 send2 = new Send2();
		recive.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		send2.start();
	}
}

class Recive2 extends Thread{
	public void run(){
		try {
			DatagramSocket socket = new DatagramSocket(6666);
			
			DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
			
			while(true){
				socket.receive(packet);
				byte[] arr = packet.getData(); //获取数据
				int len = packet.getLength();  //获取有效字节个数
				String ip = packet.getAddress().getHostAddress();
				int port = packet.getPort();
				System.out.println(ip+" :"+ port+" : "+new String(arr , 0 ,len));
			}
		} catch (SocketException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}

class Send2 extends Thread{
	public void run() {
		try {
			Scanner in = new Scanner(System.in);
			DatagramSocket socket = new DatagramSocket();
			while(true){
				String str = in.nextLine();
				if("quit".equals(str)){
					break;
				}
				DatagramPacket packet = new DatagramPacket(
						str.getBytes(),
						str.getBytes().length,
						InetAddress.getByName("127.0.0.1"),6666
						);
				socket.send(packet);
			}
			socket.close();//底层是IO流
		} catch (SocketException e) {
			
			e.printStackTrace();
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}