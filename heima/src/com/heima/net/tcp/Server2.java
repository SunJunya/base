package com.heima.net.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
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
		while(true){
			final Socket socket = server.accept();
			new Thread(){
				public void run(){
					
					
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));//���ֽ�����װ�����ַ���
						PrintStream ps = new PrintStream(socket.getOutputStream());//PrintStream����д�����еķ���
						
						ps.print("����������ͻ���д");
						ps.println("���������");
						
						System.out.println("���յ��˿ͻ��˷����ĵ�����"+br.readLine());
						
						socket.close();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				}
			}.start();
		}
		
	}
}
