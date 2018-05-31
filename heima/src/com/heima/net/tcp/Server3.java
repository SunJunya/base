package com.heima.net.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/*服务端*/
public class Server3 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(23456);
		System.out.println("服务器启动，绑定端口号：23456");
		while(true){
			final Socket socket = server.accept();  //接收客户端的请求
			new Thread(){
				public void run() {
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));//获取输入流
						PrintStream ps = new PrintStream(socket.getOutputStream());//获取输出流
						
						String line = br.readLine();
						line = new StringBuilder(line).reverse().toString();//将客户端传过来的数据读取出来
						ps.println(line);
						
						socket.close();
						
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				}
			}.start();
		}
	}
}
