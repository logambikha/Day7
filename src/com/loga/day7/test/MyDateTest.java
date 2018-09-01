package com.loga.day7.test;


import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.logaday7.MyDate;

class MyDateTest{

	@Test
	void testDate() {
		ArrayList<MyDate> dt = new ArrayList<>();
		 dt.add(new MyDate("12/12/2012"));
		 dt.add(new MyDate("02/11/2009"));
		 dt.add(new MyDate("29/08/2002"));
		 dt.add(new MyDate("09/02/2015"));
		 dt.add(new MyDate("10/10/2000"));
		
		 try {
			FileOutputStream ft=new FileOutputStream("C:\\Users\\lsakthiv\\Desktop\\file.ser");
			
			ObjectOutputStream out=new ObjectOutputStream (ft);
			out.writeObject(dt);
			
		} 
		  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		 
		 
		 @SuppressWarnings("unchecked")
		@Test
		 void testReadDate() {
		 try {
			FileInputStream ft=new FileInputStream("C:\\Users\\lsakthiv\\file.ser");
			 @SuppressWarnings("resource")
			ObjectInputStream in=new ObjectInputStream (ft);
			 
			 @SuppressWarnings("unused")
			ArrayList<MyDate> dt1 = new ArrayList<>();
			 dt1 = (ArrayList<MyDate>) in . readObject();
			 
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 

}
	  
	

}
