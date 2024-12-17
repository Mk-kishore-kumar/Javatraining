package com.day8;

import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\Kishore Kumar\\Desktop\\New folder\\filereader.txt");
		
		int ch;
		while((ch = fr.read()) != -1) {
			
			System.out.print((char)ch);
		}
		fr.close();
		 
	}

}
