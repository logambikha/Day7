package com.loga.day7.test;

import org.junit.jupiter.api.Test;

import com.logaday7.CountVowels;

class CountVowelsTest {

	@Test
	void testCountVowelsandConsonents() {
		CountVowels count;
		
		count = CountVowels.countVowelsandConsonents("C:\\Users\\lsakthiv\\Desktop\\New folder\\file.txt");
		System.out.println(count);
	}


}
