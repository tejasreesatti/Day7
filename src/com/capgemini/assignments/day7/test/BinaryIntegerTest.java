package com.capgemini.assignments.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.assignments.day7.BinaryInteger;

class BinaryIntegerTest {


	@Test
	void testBinaryInteger() {
		File file = new File("C:\\Users\\admin\\Desktop\\teja.txt");
		assertEquals(1,BinaryInteger.writeBinary(file));
	}

}
