package com.heima.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	/*
	 * �����
		* ����ServerSocket(��Ҫָ���˿ں�)
		* ����ServerSocket��accept()��������һ���ͻ������󣬵õ�һ��Socket
		* ����Socket��getInputStream()��getOutputStream()������ȡ�Ϳͻ���������IO��
		* ���������Զ�ȡ�ͻ��������д��������
		* ���������д�����ݵ��ͻ��˵�������
	 * */
	public static void main(String[] args) throws IOException {
		System.out.println("���Ƿ����");
		ServerSocket server = new ServerSocket(5555);
		Socket socket = server.accept();
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		os.write("�ٶ�".getBytes());//��������ͻ���д������
		
		byte[] arr = new byte[1024];
		int len = is.read(arr);    //��������ȡ�ͻ��˷���������
		System.out.println("�ͻ���  :"+new String(arr,0,len));
		socket.close();
		
	}
}
