package com.capgemini.assignment.day7;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class fileExistTest {

	@Test
	void test() {
		File file = new File("C:\\msdia80.dll");
		assertEquals(true, file.exists());
	}

}
