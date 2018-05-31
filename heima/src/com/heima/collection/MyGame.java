package com.heima.collection;

import java.util.ArrayList;
import java.util.HashMap;

public class MyGame {
	/**
	 * 模拟斗地主洗牌发牌
	 * 
	 * 分析：
	 * 1、买一副扑克，自己创建一个集合对象，将扑克牌存储进去
	 * 2、洗牌
	 * 3、发牌
	 * 4、看牌
	 * */
	public static void main(String[] args) {
		String[] num={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] color={"红桃","黑桃","方片","梅花"};
		HashMap<Integer,String> poker = new HashMap<>();
		ArrayList<Integer> listIndex=new ArrayList<>();
		
 		//拼接扑克牌
		int index=0;
		for(String s1:color){
			for(String s2:num){
//				poker.add(s1.concat(s2));
				poker.put(index, s2.concat(s1));
				index++;
			}
		}
		
		poker.put(index, "小王");
		index++;
		poker.put(index, "大王");
		//洗牌
//		Collections.shuffle();
		
		//牌友
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
