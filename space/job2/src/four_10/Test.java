package four_10;

import java.util.Arrays;

public class Test {
   public static void main(String[] args) {
	  int[] a={1,5,2,8,12};
	  Arrays.sort(a);
	  int ins=7;
	  int flag = 0;
	  int[] b=Arrays.copyOf(a, a.length+1);

	  for(int i=0;i<b.length-1;i++){
		  if(ins<=a[i]){
			  b[i+1]=a[i];
			  
			  if(flag!=0) continue;
			  else flag=i;
		  }

	  }
	  System.out.println();
	  b[flag]=ins;
	  for(int i=0;i<b.length;i++){
		  System.out.print(b[i]+" ");
	  }
	  
  }
}
