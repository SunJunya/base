package four_9;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a=new int[10];      
        Scanner in=new Scanner(System.in);
        int max=a[0];
        for(int i=0;i<a.length;i++){
        	a[i]=in.nextInt();
        }
        int j=0;
		for(int i=1;i<a.length;i++){
        	if(a[i]>max){
        		max=a[i];
        		j=i;
        	}
        }
        a[j]=a[0];
        a[0]=max;
        
        for(int i=0;i<a.length;i++){
        	System.out.print(a[i]+"  ");
        }        
        
        
	}

}
