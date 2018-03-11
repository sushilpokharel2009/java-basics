package com.stosh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class mainMethod {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Write w = new Write();
		
		try {
			
			w.name = "Hari";
			w.age = 12;
			
			File f1 = new File("a.text");
			
			
			FileOutputStream fo = new FileOutputStream(f1);
			ObjectOutputStream os = new ObjectOutputStream(fo);
			
			os.writeObject(w);
			
			os.close();
			
//			System.out.println("------------");
//			
//			FileInputStream fi = new FileInputStream(f1);
//			ObjectInputStream oi = new ObjectInputStream(fi);
//			
//			Write w1 = (Write)oi.readObject();
//			
//			oi.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
		

	}

}
