package four_1;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
//        int n=in.nextInt();
        int  n=30;
        long total=0;
        for(int i=1;i<=n;i++){
        	int sum=count(i);
//        	System.out.println("sum="+sum);
        	total+=sum;
//        	System.out.println("total="+total);
        }
        System.out.println(total);
        
	}
	
	private static  int count(int n) {
		if(n==1) return 1;
		return n*count(n-1);
		
	}

}
