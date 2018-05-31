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

/*客户端*/
public class Client4 {
	/** 客户端向服务器上传文件
	 * 1. 提示输入要上传的文件路径，验证路径是否存在以及是否是文件夹
	 * 2. 发送文件名到服务端      （服务端判断文件是否存在）
	 * 6. 接收结果，如果存在给予提示，程序直接退出
	 * 7. 如果不存在，定义FileInputStream读取文件，写出到网络
	 *  */
	public static void main(String[] args) throws UnknownHostException, IOException {
		//提示输入要上传的文件路径，验证路径是否存在以及是否是文件夹
		File file = getFile();
		
		//发送文件名到服务端      （服务端判断文件是否存在）
		Socket socket = new Socket("127.0.0.1", 12345);
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		ps.println(file);
		
		String str = br.readLine() ;
		if("true".equals(str)){  //接收结果，如果存在给予提示，程序直接退出
			System.out.println("您上传的文件已经存在，请不要重复上传");
			socket.close();
			return;
		}
		
		//如果不存在，定义FileInputStream读取文件，写出到网络
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
		Scanner in = new Scanner(System.in);   //创建键盘输入对象
		System.out.println("请输入一个文件路径");
		
		while(true){
			String str = in.nextLine();
			File file = new File(str);
			if(!file.exists()){
				System.out.println("您录入的文件路径不存在，请重新输入：");
			}else if (file.isDirectory()) {
				System.out.println("您录入的是文件夹路径，请输入一个文件路径");
			}else {
				return file;
			}	
		}
	}
}
