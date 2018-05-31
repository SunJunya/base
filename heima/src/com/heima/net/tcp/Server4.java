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

/*服务端*/
public class Server4 {
	/**客户端向服务器上传文件
	 * 3.  建立多线程的服务器
	 * 4.  读取文件名
	 * 5.  判断文件是否存在，将结果发回客户端
	 * 8.  定义FileOutputStream，从客户端读取数据，存到服务器中
	 * 
	 * */
	public static void main(String[] args) throws IOException {
//		建立多线程的服务器
		ServerSocket server = new ServerSocket(12345);
		System.out.println("服务器启动，绑定端口号12345");
		
		//多线程
		while(true){
			final Socket socket = server.accept();  //接收请求
			
			new Thread(){
				public void run() {
					try {
						InputStream is = socket.getInputStream();
						BufferedReader br = new BufferedReader(new InputStreamReader(is));
						PrintStream ps = new PrintStream(socket.getOutputStream());
						String fileName= br.readLine();  // 读取文件名
						
//						判断文件是否存在，将结果发回客户端
						File dir = new File("update");
						dir.mkdir();   //创建文件夹
						File f = new File(dir,fileName);
						if(f.exists()){
							ps.println("true");//"服务器存在这个文件"
							socket.close();
							return;
						}else {
							ps.println("false");//服务器不存在这个文件	
						}
						
						
						//定义FileInputStream，从客户端读取数据，存到服务器中
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
