package com.heima.collection;

import java.util.ArrayList;
import java.util.HashMap;

public class MyGame {
	/**
	 * ģ�⶷����ϴ�Ʒ���
	 * 
	 * ������
	 * 1����һ���˿ˣ��Լ�����һ�����϶��󣬽��˿��ƴ洢��ȥ
	 * 2��ϴ��
	 * 3������
	 * 4������
	 * */
	public static void main(String[] args) {
		String[] num={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] color={"����","����","��Ƭ","÷��"};
		HashMap<Integer,String> poker = new HashMap<>();
		ArrayList<Integer> listIndex=new ArrayList<>();
		
 		//ƴ���˿���
		int index=0;
		for(String s1:color){
			for(String s2:num){
//				poker.add(s1.concat(s2));
				poker.put(index, s2.concat(s1));
				index++;
			}
		}
		
		poker.put(index, "С��");
		index++;
		poker.put(index, "����");
		//ϴ��
//		Collections.shuffle();
		
		//����
		ArrayList<String> zhangsan = new ArrayList<>();
		ArrayList<String> lisi = new ArrayList<>();
		ArrayList<String> wangwu = new ArrayList<>();
		
		ArrayList<String> dipai = new ArrayList<>();
		for(int i=0;i<poker.size();i++){
			if(i>=poker.size()-3){
				dipai.add(poker.get(i));
			}else if(i%3==0){
				zhangsan.add(poker.get(i));
			}else if (i%3==1) {
				lisi.add(poker.get(i));
				
			}else {
				wangwu.add(poker.get(i));
			}
			
		}
		
		System.out.println(zhangsan);
		System.out.println(lisi);
		System.out.println(wangwu);
		System.out.println(dipai);
	}
}
