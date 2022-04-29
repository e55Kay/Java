package com.comcast.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedInputStream;


public class ReadBuffFileDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File("city.txt");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		byte[] byteContent = new byte[1024];
		int ch = 0;
		String content = null;
		
		if((ch = bis.read(byteContent)) != -1) {
			content = new String(byteContent, 0, ch);
		}
		
		System.out.println(content);
		bis.close();
		fis.close();

	}

}
