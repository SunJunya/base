package com.heima.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*客户端*/
public class Client {
	/*客户端
		* 创建Socket连接服务端(指定ip地址,端口号)通过ip地址找对应的服务器
		* 调用Socket的getInputStream()和getOutputStream()方法获取和服务端相连的IO流
		* 输入流可以读取服务端输出流写出的数据
		* 输出流可以写出数据到服务端的输入流*/
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("这是客户端");
		Socket socket = new Socket("127.0.0.1", 5555);
		InputStream is = socket.getInputStream(); //获取客户端输入流
		OutputStream os = socket.getOutputStream(); //获取客户端的输出流
		
		byte[] arr = new byte[1024];
		int len = is.read(arr);      //客户端读取服务端发送的数据
		System.out.println("服务端    :"+new String(arr,0,len));
		
		os.write("学习学习".getBytes());  //客户端向服务端写数据
		socket.close();
	}
}
