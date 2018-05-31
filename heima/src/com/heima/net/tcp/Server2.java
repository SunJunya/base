package com.heima.net.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
	/*
	 * 服务端
		* 创建ServerSocket(需要指定端口号)
		* 调用ServerSocket的accept()方法接收一个客户端请求，得到一个Socket
		* 调用Socket的getInputStream()和getOutputStream()方法获取和客户端相连的IO流
		* 输入流可以读取客户端输出流写出的数据
		* 输出流可以写出数据到客户端的输入流
	 * */
	public static void main(String[] args) throws IOException {
		
		System.out.println("这是服务端");
		ServerSocket server = new ServerSocket(5555);
		while(true){
			final Socket socket = server.accept();
			new Thread(){
				public void run(){
					
					
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));//将字节流包装成了字符流
						PrintStream ps = new PrintStream(socket.getOutputStream());//PrintStream中有写出换行的方法
						
						ps.print("服务器先向客户端写");
						ps.println("你多少岁呢");
						
						System.out.println("我收到了客户端发来的的数据"+br.readLine());
						
						socket.close();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				}
			}.start();
		}
		
	}
}
