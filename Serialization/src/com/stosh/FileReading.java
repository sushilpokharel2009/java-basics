package com.stosh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileReading {

	public FileReading(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
		//FileReading fr = new FileReading("a.text");
		
		try {
		File f1 = new File("a.text");
		
		FileInputStream fi = new FileInputStream(f1);
		ObjectInputStream oi = new ObjectInputStream(fi);
			
		Write w1 = (Write)oi.readObject();
		
		oi.close();
		System.out.println(w1.name +" is "+ w1.age+" years old.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	

	}

}
