package P84;

import java.util.Comparator;

public class t_Comparator implements Comparator<Integer> {


	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1>o2) return -1;
		else if(o1.equals(o2)) return 0;
		else return 1;
	}

}
