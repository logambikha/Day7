package com.loga.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FileOperationTest {

	@Test
	void testReverse() {
//		FileOperation.reverse("C:\\cspro\\FileOperation\\reverse.txt", "C:\\cspro\\FileOperation\\reverseOutput.txt");
		FileOperation.convert("C:\\cspro\\FileOperation\\reverse.txt", "C:\\cspro\\FileOperation\\convertOutput.txt");
	}
}
