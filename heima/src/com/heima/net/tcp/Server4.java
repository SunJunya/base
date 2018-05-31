package com.heima.net.tcp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/*�����*/
public class Server4 {
	/**�ͻ�����������ϴ��ļ�
	 * 3.  �������̵߳ķ�����
	 * 4.  ��ȡ�ļ���
	 * 5.  �ж��ļ��Ƿ���ڣ���������ؿͻ���
	 * 8.  ����FileOutputStream���ӿͻ��˶�ȡ���ݣ��浽��������
	 * 
	 * */
	public static void main(String[] args) throws IOException {
//		�������̵߳ķ�����
		ServerSocket server = new ServerSocket(12345);
		System.out.println("�������������󶨶˿ں�12345");
		
		//���߳�
		while(true){
			final Socket socket = server.accept();  //��������
			
			new Thread(){
				public void run() {
					try {
						InputStream is = socket.getInputStream();
						BufferedReader br = new BufferedReader(new InputStreamReader(is));
						PrintStream ps = new PrintStream(socket.getOutputStream());
						String fileName= br.readLine();  // ��ȡ�ļ���
						
//						�ж��ļ��Ƿ���ڣ���������ؿͻ���
						File dir = new File("update");
						dir.mkdir();   //�����ļ���
						File f = new File(dir,fileName);
						if(f.exists()){
							ps.println("true");//"��������������ļ�"
							socket.close();
							return;
						}else {
							ps.println("false");//����������������ļ�	
						}
						
						
						//����FileInputStream���ӿͻ��˶�ȡ���ݣ��浽��������
						FileOutputStream fos = new FileOutputStream(f);
						byte[] arr = new byte[8192];
						int len = 0;
						while((len=is.read(arr))!=-1){
							fos.write(arr,0,len);
						}
						
						fos.close();
						socket.close();
						
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				}
			}.start();
		}
	}
}
