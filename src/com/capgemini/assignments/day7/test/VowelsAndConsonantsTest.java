package com.capgemini.assignments.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.assignments.day7.VowelsAndConsonants;

class VowelsAndConsonantsTest {

	@Test
	void testVowelsAndConsonants() throws IOException {
		File file = new File("C:\\Users\\admin\\Desktop\\teja.txt");

		assertEquals("Number of vowels = 31\nNumber of consonants = 76", VowelsAndConsonants.findVowelAndConsonant(file));
	}

}
