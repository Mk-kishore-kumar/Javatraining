package com.day8;
import java.util.Calendar;

public class UtilityClass2 {
	
	

	public static void main(String[] args) {
		
		Calendar c =Calendar.getInstance();//this is singletonclass
		
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//default final,static
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.YEAR));
		
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		
		
	}

}
