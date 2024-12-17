package com.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fr = new FileInputStream("C:\\Users\\Kishore Kumar\\Downloads\\doremon.png");
		FileOutputStream fw = new FileOutputStream("C:\\Users\\Kishore Kumar\\Downloads\\doremon1.png");
		
		int ch;
		while((ch = fr.read()) != -1) {
			
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("Image copied");
		 
	}

}
