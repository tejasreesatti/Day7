package com.capgemini.assignments.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.assignments.day7.TodayDate;

class TodayDateTest {

	@Test
	void testformat() {

		assertEquals("SUNDAY,SEPTEMBER 2,2018", TodayDate.format());
	}


}
