package com.heima.net.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/*�ͻ���*/
public class Client3 {
	/** �ͻ����������д�ַ���(����¼��),������(���߳�)���ַ�����ת��д��,�ͻ����ٴζ�ȡ���Ƿ�ת����ַ���
	 * @throws IOException 
	 * @throws UnknownHostException */
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner in = new Scanner(System.in);  //��������¼�����
		Socket socket = new Socket("127.0.0.2", 23456);  //�����ͻ���ָ����ip��ַ�Ͷ˿ں�
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));//��ȡ������
		PrintStream ps = new PrintStream(socket.getOutputStream());  //��ȡ�����
		
		String str = in.nextLine();
		ps.println(str);
 		
		System.out.println(br.readLine());  //�����������������������
		
		socket.close();
	}
}
