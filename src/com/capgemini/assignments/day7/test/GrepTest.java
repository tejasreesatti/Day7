package com.capgemini.assignments.day7.tests;


//import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.assignments.day7.Grep;



class GrepTest {

	@Test
	void testGrepApp() {
		File file = new File("C:\\javacloud\\textfile.txt");
		assertEquals(false, Grep.stringSearch(file, "in"));

	}

}

