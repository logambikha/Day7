package com.logaday7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Grep {
	public static boolean checkGrep(String sub) {
		File file=new File("C:\\Users\\lsakthiv\\Documents\\ab\\cd.txt");
		int count=0;
		
		try {
			FileReader fr=new FileReader(file); 
		BufferedReader reader=new BufferedReader(fr); 
		{
			
			String s = null;
			while((s=reader.readLine())!=null) {
				count++;
				if(s.toLowerCase().contains(sub.toLowerCase())) {
					System.out.println(s);
					System.out.println("The substring is present in line number "+count);
					return true;
				}
			}
		}
	}catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
}}
