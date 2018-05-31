package com.heima.net.tcp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/*�ͻ���*/
public class Client4 {
	/** �ͻ�����������ϴ��ļ�
	 * 1. ��ʾ����Ҫ�ϴ����ļ�·������֤·���Ƿ�����Լ��Ƿ����ļ���
	 * 2. �����ļ����������      ��������ж��ļ��Ƿ���ڣ�
	 * 6. ���ս����������ڸ�����ʾ������ֱ���˳�
	 * 7. ��������ڣ�����FileInputStream��ȡ�ļ���д��������
	 *  */
	public static void main(String[] args) throws UnknownHostException, IOException {
		//��ʾ����Ҫ�ϴ����ļ�·������֤·���Ƿ�����Լ��Ƿ����ļ���
		File file = getFile();
		
		//�����ļ����������      ��������ж��ļ��Ƿ���ڣ�
		Socket socket = new Socket("127.0.0.1", 12345);
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		ps.println(file);
		
		String str = br.readLine() ;
		if("true".equals(str)){  //���ս����������ڸ�����ʾ������ֱ���˳�
			System.out.println("���ϴ����ļ��Ѿ����ڣ��벻Ҫ�ظ��ϴ�");
			socket.close();
			return;
		}
		
		//��������ڣ�����FileInputStream��ȡ�ļ���д��������
		FileInputStream fis = new FileInputStream(file);
		byte[] arr = new byte[8192];
		int len=0;
		while((len=fis.read(arr))!=-1){
			ps.write(arr);
		}
		fis.close();
		socket.close();
	}

	private static File getFile() {
		Scanner in = new Scanner(System.in);   //���������������
		System.out.println("������һ���ļ�·��");
		
		while(true){
			String str = in.nextLine();
			File file = new File(str);
			if(!file.exists()){
				System.out.println("��¼����ļ�·�������ڣ����������룺");
			}else if (file.isDirectory()) {
				System.out.println("��¼������ļ���·����������һ���ļ�·��");
			}else {
				return file;
			}	
		}
	}
}
