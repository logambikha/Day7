package com.logaday7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountVowels {
	private int vowels;
	private int consonents;
	
	
	public CountVowels() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CountVowels(int vowels, int consonents) {
		super();
		this.vowels = vowels;
		this.consonents = consonents;
	}
	
	public static CountVowels countVowelsandConsonents(String link)  {
		int vowels=0;
		int consonents=0;
		try(FileReader fileReader = new FileReader(link);
				BufferedReader reader = new BufferedReader(fileReader)) {
			String buffer;
			while((buffer = reader.readLine()) != null) {
				for(int i=0; i<buffer.length(); i++) {
					switch (buffer.toLowerCase().charAt(i)) {
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u': vowels++;
					break;
					default:
						consonents++;
					}
					
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new CountVowels(vowels, consonents);
	}


	@Override
	public String toString() {
		return "CountVowels [vowels=" + vowels + ", consonents=" + consonents + "]";
	
	
	
	
}}


	
