package com.capgemini.assignments.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.assignments.day7.MyDate;

class MyDateTest {

	@Test
	void test() throws IOException, ClassNotFoundException {
		MyDate d1=new MyDate() ;
		MyDate d2=new MyDate() ;
		MyDate d3=new MyDate() ;
		MyDate d4=new MyDate() ;
		MyDate d5=new MyDate() ;
		
		ArrayList<MyDate> array= new ArrayList<>() ;
		array.add(d1) ;
		array.add(d2) ;
		array.add(d3) ;
		array.add(d4) ;
		array.add(d5) ;
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\teja.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(array);
		
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Desktop\\teja.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		ArrayList<MyDate> array1 = (ArrayList<MyDate>) ois.readObject();
		ois.close();
		assertEquals(1,array1.get(0).a);
		assertEquals("tej",array1.get(2).name);
		
	}

	}


