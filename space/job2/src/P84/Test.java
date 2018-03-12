package P84;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Integer[] sorce={67,89,87,69,90,100,75,90};
         Arrays.sort(sorce, new t_Comparator());
         for(int i=0;i<sorce.length;i++){
        	 System.out.print(sorce[i]+"\t");
         }
	}


	
}
