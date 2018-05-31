package com.heima.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
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
		Socket socket = server.accept();
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		os.write("百度".getBytes());//服务器向客户端写出数据
		
		byte[] arr = new byte[1024];
		int len = is.read(arr);    //服务器读取客户端发来的数据
		System.out.println("客户端  :"+new String(arr,0,len));
		socket.close();
		
	}
}
