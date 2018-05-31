package com.heima.IO.file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Practice {
	public static void main(String[] args) throws FileNotFoundException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("su.jpg"));
	}
}
