package com.question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.omg.CORBA.ARG_OUT;

class Student  implements Comparable<Student>{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		return arg0.getScore()-this.getScore();
	}
	@Override
	public String toString() {
		return "name=" + name + ", score=" + score ;
	}
	
	
	
}

public class Demo {
     public static void main(String[] args) {
    	 Scanner in=new Scanner(System.in);
    	 
    	String string=in.nextLine();
    	List<Student> students = new ArrayList<Student>();
    	String[] names=string.split("\\|");
    	for(int i=0;i<names.length;i++)
    	{
    		String[] scores=names[i].split("\\:");     		
    		String name=scores[0];
    		String score=scores[1];
    		
    		students.add(new Student(name,Integer.parseInt(score)));
    	
    	}
    	
        Collections.sort(students);
        
         for(int i=0;i<3;i++) {
        	System.out.print(students.get(i)+"|"+" ");
         }
         
	}
}
