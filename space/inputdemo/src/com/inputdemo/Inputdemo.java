package com.inputdemo;
import java.util.Scanner;

public class Inputdemo {

	public static void main(String[] args) {
       int[] claNum=new int[3];//�����༶
       int stuNum=4;
       int sum=0;
       int avg=0;
       Scanner input=new Scanner(System.in);
       for(int i=1;i<=claNum.length;i++){
    	   sum=0;
    	   System.out.println("�������"+i+"���༶ѧ���ɼ�:");
    	   for(int j=1;j<=stuNum;j++){
    		   System.out.println("�������"+j+"��ѧ���ĳɼ�:");
    		   int score=input.nextInt();
    		   sum+=score;
    	   }
    	   avg=sum/stuNum;
    	   System.out.println("�ð��ƽ���ɼ�Ϊ��"+avg);
       }
	}
    
}