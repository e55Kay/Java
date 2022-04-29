package com.comcast.io;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WriteFileDemo {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("course.txt");
		byte[] data = new byte[1024];
		String content = "hello, this is java@11 course.";
		
		data = content.getBytes();
		fos.write(data);
		System.out.println("File created and the content is added");
		fos.close();

	}

}
