package com.loga.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.logaday7.Grep;

class GrepTest {

	@Test
	void testGrep() {
		assertEquals(true,Grep.checkGrep("is good"));
		
	}

}
