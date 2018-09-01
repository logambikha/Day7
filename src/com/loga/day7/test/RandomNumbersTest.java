package com.loga.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import org.junit.jupiter.api.Test;

class RandomNumbersTest {

	@Test
	void testFileWithRandomNumbers() {
		Random r = new Random();
		File file = new File("C:\\prog\\log.txt");
		try (PrintWriter writer = new PrintWriter(file)) {
			for (Integer i = 0; i < 100; i++) {
				writer.println(r.nextInt(50));
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}


}
