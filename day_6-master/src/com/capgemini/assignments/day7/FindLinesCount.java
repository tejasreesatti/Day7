package com.capgemini.assignments.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FindLinesCount {

	public static int countLines(File file) throws IOException {
		int lines=0;
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		
		while(reader.readLine() != null)
			lines++;
		reader.close();
		
		return lines;
		
	}

}
