package four_6;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int  a[]=new int[10];
        int b[] =new int[10];
        for(int i=0;i<a.length;i++){
        	a[i]=i;
        	System.out.print(a[i]+"  ");
        }
        
        System.out.println();
        for(int i=0;i<a.length;i++){
        	b[i]=a[a.length-i-1];       	
        }
        a=b;
        for(int i=0;i<a.length;i++){
        	System.out.print(a[i]+"  ");
        }
	}

}
