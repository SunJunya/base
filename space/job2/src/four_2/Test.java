package four_2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count_a=0;//��¼��������
        int count_b=0;//��¼ż������
        int[] arr={1,2,3,4,5,6,7,8,24,67};
        for(int i=0;i<arr.length;i++){
        	if(arr[i]%2==0)  count_b++;
        	else count_a++;
        }
        System.out.println("����������"+count_a);
        System.out.println("ż��������"+count_b);
        
	}


}
