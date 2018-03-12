package com.book;
import java.util.Scanner;

public class Book {
	   static String bookName;
       static int bookNum;
       double bookprice;
       public  void book_Num() {
    	   bookNum++;
    	   System.out.println("该书本编号为："+bookNum);
	}
		
	/*
	 */
	public static void main(String[] args) {
        String[] bookconunt =new String[10];
        Scanner input=new Scanner(System.in);
        Book[] book=new Book[10];
        for (int i = 0; i < book.length; i++) {
			bookName=input.next();
		}
	}

}
