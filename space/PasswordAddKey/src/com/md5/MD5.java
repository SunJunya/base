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
			//����һ���ṩ��ϢժҪ�㷨�Ķ��󣬳�ʼ��Ϊû���㷨����
			
			byte[] input=string.getBytes();
			//����Ϣ���byte����
			
			byte[] buff=mDigest.digest(input);
			//��������ֽ����飬�������128λ��
			
			md5str=bytesToHex(buff);
			//������ÿһ�ֽ�(һ���ֽ�ռ��λ)����16��������MD5�ַ���
			
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return md5str;
	}

	private static String bytesToHex(byte[] buff) {
		StringBuffer md5str=new StringBuffer();
		
		int digital;
		//������ÿһ���ֽڻ���16��������MD5�ַ���
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
