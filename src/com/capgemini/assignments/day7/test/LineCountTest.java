package com.capgemini.assignments.day7.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.assignments.day7.FindLinesCount;

class LineCountTest {

	@Test
	void test() throws IOException {
		
		assertEquals(4, FindLinesCount.countLines(new File("C:\\\\Users\\\\admin\\\\Desktop\\\\teja.txt")));
	}

}
