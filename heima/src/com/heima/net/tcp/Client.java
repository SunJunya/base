package com.heima.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*�ͻ���*/
public class Client {
	/*�ͻ���
		* ����Socket���ӷ����(ָ��ip��ַ,�˿ں�)ͨ��ip��ַ�Ҷ�Ӧ�ķ�����
		* ����Socket��getInputStream()��getOutputStream()������ȡ�ͷ����������IO��
		* ���������Զ�ȡ����������д��������
		* ���������д�����ݵ�����˵�������*/
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("���ǿͻ���");
		Socket socket = new Socket("127.0.0.1", 5555);
		InputStream is = socket.getInputStream(); //��ȡ�ͻ���������
		OutputStream os = socket.getOutputStream(); //��ȡ�ͻ��˵������
		
		byte[] arr = new byte[1024];
		int len = is.read(arr);      //�ͻ��˶�ȡ����˷��͵�����
		System.out.println("�����    :"+new String(arr,0,len));
		
		os.write("ѧϰѧϰ".getBytes());  //�ͻ���������д����
		socket.close();
	}
}
