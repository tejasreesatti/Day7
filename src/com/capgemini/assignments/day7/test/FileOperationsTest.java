package com.capgemini.assignments.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.assignments.day7.FileOperations;

class FileOperationsTest {

	@Test
	void testReverse() {
		assertEquals(true, FileOperations.reverse("C:\\teja\\tejasree.txt", "C:\\teja\\reverse.txt"));
		assertEquals(true, FileOperations.convert("C:\\teja\\tejasree.txt", "C:\\teja\\convert.txt"));
		assertEquals(true, FileOperations.compare("C:\\teja\\tejasree.txt", "C:\\teja\\compare.txt"));
	}
}
