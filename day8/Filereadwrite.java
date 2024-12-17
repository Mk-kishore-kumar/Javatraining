package com.day8;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filereadwrite {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\Kishore Kumar\\Desktop\\New folder\\filereader.txt");
		FileWriter fw = new FileWriter("C:\\Users\\Kishore Kumar\\Desktop\\New folder\\filereader2.txt");
		
		int ch;
		while((ch = fr.read()) != -1) {
			
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("File Copied");
		 
	}

}
