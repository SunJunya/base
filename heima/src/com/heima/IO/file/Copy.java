package com.heima.IO.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Copy {

	public static void main(String[] args) throws IOException {
//		demo1();
//		demo2();//available��������
//		demo3();//С���鿽��
//		demo4();//����������
//		demo5();
		Scanner in = new Scanner(System.in);
		FileOutputStream fos=new FileOutputStream("yyy.txt");
		while(true){
			String line = in.nextLine();
			if("quit".equals(line)){
				break;
			}
			fos.write(line.getBytes());
			fos.write("\r\n".getBytes());
			
			
		}
		fos.close();
		
	}

	private static void demo5() throws FileNotFoundException, IOException {
		FileInputStream fis=new FileInputStream("yyy.txt");
		byte[] arr = new byte[2];
		int len;
		while((len=fis.read(arr))!=-1){
			System.out.println(new String(arr,0,len));
		}
//		FileOutputStream fos = new FileOutputStream("yyy.txt");
	}

	private static void demo4() throws FileNotFoundException, IOException {
		FileInputStream fis=new FileInputStream("���� - You Are Beautiful.mp3");//��������������
		FileOutputStream fos = new FileOutputStream("copy4.mp3");//�������������
		BufferedInputStream bis = new BufferedInputStream(fis);//�������������󣬶����������а�װ�����ø���ǿ��
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int b;
		while((b=bis.read())!=-1){
			bos.write(b);
		}
		bis.close();
		bos.close();
	}

	private static void demo3() throws FileNotFoundException, IOException {
		FileInputStream fis=new FileInputStream("���� - You Are Beautiful.mp3");
		FileOutputStream fos = new FileOutputStream("copy3.mp3");
		byte[] bs =new byte[1024*8];//С����ĳ���һ����1024�ı���
		int len;
		while((len=fis.read(bs))!=-1){//�˴�read���������Ǵ���byte���飬���صĲ��Ƕ�ȡ���ֽڸ����������ֽڵ����ֵ
			fos.write(bs,0,len);
		}
		fis.close();
		fos.close();
	}

	private static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis=new FileInputStream("su.jpg");
		FileOutputStream fos = new FileOutputStream("copy2.jpg");
		int len = fis.available();
		System.out.println(len);
		byte[] bs =new byte[len];
		fis.read(bs);//���ļ��е����������ȡ��byte������
		fos.write(bs);//���ֽ������е��ֽ����д���ļ���
		fis.close();
		fos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis=new FileInputStream("su.jpg");
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		int b;
		while((b=fis.read())!=-1){
			fos.write(b);
		}
		fis.close();
		fos.close();
	}

}
