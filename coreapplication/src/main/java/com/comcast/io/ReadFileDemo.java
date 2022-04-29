package com.comcast.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		int ch;
		
		File file = new File("city.txt");
		FileInputStream fis = new FileInputStream(file);
		
		if(fis != null) {
			System.out.println("File is availble");
		}
		
		StringBuffer sb = new StringBuffer();
		while((ch = fis.read()) != -1) {
			sb.append((char)ch);
		}
		
		fis.close();
		System.out.println(sb);

	}

}
