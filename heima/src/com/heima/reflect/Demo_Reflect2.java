package com.heima.reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo_Reflect2 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("config.properties"));
		String str = br.readLine();
		Class clazz = Class.forName(str);
		Fruits f = (Fruits) clazz.newInstance();
		f.quezze();
 	}
}

interface Fruits{
	public void quezze();
}

class Apple implements Fruits{

	@Override
	public void quezze() {
		System.out.println("ե��һ��ƻ��֭");
	}
	
}

class Orange implements Fruits{

	@Override
	public void quezze() {
		System.out.println("�ҳ�һ������֭");
	}
	
}

class Juice{
	public void run(Fruits f){
		f.quezze();
	}
}
