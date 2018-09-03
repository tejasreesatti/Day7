package com.capgemini.assignments.day7.tests;

import static org.junit.Assert.assertEquals;
import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.assignments.day7.FindWordsCount;

class CountTheWordsTest {

	@Test
	void test() {
		assertEquals(6, FindWordsCount.countWords(new File("C:\\\\Users\\\\admin\\\\Desktop\\\\teja.txt")));
	}

}
