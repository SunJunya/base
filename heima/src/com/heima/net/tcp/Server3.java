package com.heima.net.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/*�����*/
public class Server3 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(23456);
		System.out.println("�������������󶨶˿ںţ�23456");
		while(true){
			final Socket socket = server.accept();  //���տͻ��˵�����
			new Thread(){
				public void run() {
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));//��ȡ������
						PrintStream ps = new PrintStream(socket.getOutputStream());//��ȡ�����
						
						String line = br.readLine();
						line = new StringBuilder(line).reverse().toString();//���ͻ��˴����������ݶ�ȡ����
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
