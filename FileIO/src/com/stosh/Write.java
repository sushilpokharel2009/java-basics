package com.stosh;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class Write {

	public static void main(String[] args)  {
		
		
		
			try{
				File f1 = new File("a.text");
				
				if(!f1.exists()){
					f1.createNewFile();
				}
				String x = "Hello funny world 2017.";
				
				FileWriter fw = new FileWriter(f1);
				
				fw.write(x);
				fw.close();
				
			}catch(Exception e){
				e.printStackTrace();
			}
		


	}

}
