package com.heima.net.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*�ͻ���*/
public class Client2 {
	/*�ͻ���
		* ����Socket���ӷ����(ָ��ip��ַ,�˿ں�)ͨ��ip��ַ�Ҷ�Ӧ�ķ�����
		* ����Socket��getInputStream()��getOutputStream()������ȡ�ͷ����������IO��
		* ���������Զ�ȡ����������д��������
		* ���������д�����ݵ�����˵�������*/
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("���ǿͻ���");
		Socket socket = new Socket("127.0.0.1", 5555);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));//���ֽ�����װ�����ַ���
		PrintStream ps = new PrintStream(socket.getOutputStream());//PrintStream����д�����еķ���
		
		System.out.println("���յ��˷���˷�����Ϣ"+br.readLine());
		
		ps.println("��20����");
		
		socket.close();
	}
}
