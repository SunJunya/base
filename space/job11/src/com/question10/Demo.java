package com.question10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student>{
	private String name;
	private int index;
	private int number;
	public Student(String name, int index, int number) {
		super();
		this.name = name;
		this.index = index;
		this.number = number;
	}
	
	public Student(String name,  int number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return index+":"+name  + "["+number+" 票]" ;
	}

	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		return arg0.number-this.number;
	}
	
	
}

public class Demo {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		List<Student> students =new ArrayList<Student>();
		students.add(new Student("张三", 1, 0));
		students.add(new Student("李四", 2, 0));
		students.add(new Student("王五", 3, 0));
		students.add(new Student("赵六", 4, 0));
		
		for(Student student:students) {
			System.out.println(student);
		}
		
		while(true) {
			System.out.println("请输入班长候选人代号（数字0结束）：");
			if(in.hasNextInt()){
				int index=in.nextInt();				
				switch (index) {
				case 1:
					students.get(index-1).setNumber(students.get(index-1).getNumber()+1);
					break;
	            case 2:
	            	students.get(index-1).setNumber(students.get(index-1).getNumber()+1);
	            	break;
	            case 3:
	            	students.get(index-1).setNumber(students.get(index-1).getNumber()+1);
	            	break;
	            case 4:
	            	students.get(index-1).setNumber(students.get(index-1).getNumber()+1);
	            	break;
	            case 0:
	            	break;
				default:
					System.out.println("此选票无效，请输入正确的候选人代号");
					break;
				}
				if (index==0) {
					break;
				}
		    }else {
				  System.out.println("此选票无效，请输入正确的候选人代号");
				  continue;
			}
		}
		Collections.sort(students);
		
		for(Student student:students) {
			System.out.println(student);
		}
		System.out.println("投票最终结果："+students.get(0).getName()+"最后以"+students.get(0).getNumber()+"票当选班长！");

	}
}
