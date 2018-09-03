package com.capgemini.assignments.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.assignments.day7.ToCountLines;

class FileLinesCount {

	@Test
	void test() {
		assertEquals(4, ToCountLines.countFileLines(new File ("C:\\teja")));
	}

}
