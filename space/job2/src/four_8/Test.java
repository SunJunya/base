package four_8;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		/*int[] a=new int[30];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}*/
		
		int[] a={3,4,5,6,4,2,4,8,9,0,
				4,7,9,0,2,3,4,5,6,3,
				2,6,6,7,9,0,2,3,1,3};
		int[] count=new int[10];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<=9;j++){
				if(a[i]==j) count[j]++;
			}
		}
		for (int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}
		
	}
}
