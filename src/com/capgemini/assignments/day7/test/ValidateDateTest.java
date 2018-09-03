package com.capgemini.assignments.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.assignments.day7.ValidateDate;

class ValidateDateTest {

	@Test
	void test() throws Exception {

		assertEquals("04/06/1997", ValidateDate.validate("02/06/1997",2));
	}
}
