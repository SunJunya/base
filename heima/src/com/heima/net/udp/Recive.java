package com.heima.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Recive {
	/*接收Receive
		* 创建DatagramSocket, 指定端口号
		* 创建DatagramPacket, 指定数组, 长度
		* 使用DatagramSocket接收DatagramPacket
		* 关闭DatagramSocket
		* 从DatagramPacket中获取数据*/
	public static void main(String[] args) throws IOException {
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
		
		
	}
}
