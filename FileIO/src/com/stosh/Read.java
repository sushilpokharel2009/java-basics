package com.stosh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Read {

	public static void main(String[] args) {
		
		
		try{
			File f1 = new File("a.text");
			
			FileReader fr = new FileReader (f1);
			BufferedReader br = new BufferedReader(fr);
		
			
			System.out.println(br.readLine());
			
			br.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
