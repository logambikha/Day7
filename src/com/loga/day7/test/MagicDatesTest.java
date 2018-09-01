package com.loga.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.logaday7.MagicDates;

class MagicDatesTest {

	@Test
	void testMagicDates() {
		assertEquals (true,MagicDates.isMagicDate(04,04,16));
		assertEquals (true,MagicDates.isMagicDate(12,01,12));
		assertEquals (true,MagicDates.isMagicDate(03,02,06));
	}

}
