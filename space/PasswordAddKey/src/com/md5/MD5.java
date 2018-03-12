package com.md5;

import java.security.MessageDigest;

public class MD5 {

	public static void main(String[] args) {
		String  string="123";
		String result=getMD5(string);
		System.out.println(result);

	}

	public static String getMD5(String string) {
		String md5str="";
		try{
			MessageDigest mDigest=MessageDigest.getInstance("MD5");
			//创建一个提供信息摘要算法的对象，初始化为没得算法对象
			
			byte[] input=string.getBytes();
			//将消息变成byte数组
			
			byte[] buff=mDigest.digest(input);
			//计算后获得字节数组，这就是那128位了
			
			md5str=bytesToHex(buff);
			//把数组每一字节(一个字节占八位)换成16进制连成MD5字符串
			
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return md5str;
	}

	private static String bytesToHex(byte[] buff) {
		StringBuffer md5str=new StringBuffer();
		
		int digital;
		//把数组每一个字节换成16进制连成MD5字符串
		for(int i=0;i<buff.length;i++){
			digital=buff[i];
			if(digital<0){
				digital+=256;
			}
			if(digital<16){
				md5str.append("0");
			}
			md5str.append(Integer.toHexString(digital));
		}
		return md5str.toString().toUpperCase();
	}

}
