package com.loga.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class FileHandling2Test {

	@Test
	void testFileLineCount() throws IOException{
		File file=new File("C:\\Users\\lsakthiv\\Documents\\ab\\cd.txt");
		assertEquals(true, file.exists());
		int s=0;
	
	try(FileReader fr=new FileReader(file);
	BufferedReader br= new BufferedReader(fr);){
		while (br.readLine() != null) {
			s++;
		}
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
    asertEquals(7,s);
	}

	private void asertEquals(int i, int s) {
		// TODO Auto-generated method stub
		
	}

}
