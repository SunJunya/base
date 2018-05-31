package com.heima.net.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*客户端*/
public class Client2 {
	/*客户端
		* 创建Socket连接服务端(指定ip地址,端口号)通过ip地址找对应的服务器
		* 调用Socket的getInputStream()和getOutputStream()方法获取和服务端相连的IO流
		* 输入流可以读取服务端输出流写出的数据
		* 输出流可以写出数据到服务端的输入流*/
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("这是客户端");
		Socket socket = new Socket("127.0.0.1", 5555);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));//将字节流包装成了字符流
		PrintStream ps = new PrintStream(socket.getOutputStream());//PrintStream中有写出换行的方法
		
		System.out.println("我收到了服务端发的消息"+br.readLine());
		
		ps.println("我20岁了");
		
		socket.close();
	}
}
