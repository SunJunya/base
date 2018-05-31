package com.heima.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Send {
	/*
	 * 发送Send
		* 创建DatagramSocket, 随机端口号
		* 创建DatagramPacket, 指定数据, 长度, 地址, 端口
		* 使用DatagramSocket发送DatagramPacket
		* 关闭DatagramSocket
	*/
	public static void main(String[] args) throws IOException {
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
	}
}









