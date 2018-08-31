package com.loga.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileHandlingTest {

	@Test
	void testExistenceOfFile() {
		File file = new File("C:\\Users\\lsakthiv\\Documents\\workspace-sts-3.9.5.RELEASE\\day2\\src\\com\\loga\\day2");
		assertEquals(true, file.exists());
		//assertEquals(true, file.isFile());
	}
}
