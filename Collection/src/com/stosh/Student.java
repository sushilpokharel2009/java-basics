package com.stosh;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
//	public String name;
//	public int age;
//	public String address;
//	public int rollNo;

	public static void main(String[] args) {
		List<String> li = new ArrayList();
		li.add("Ram");
		li.add("Sita");
		li.add("Ra");
		li.add("Sa");
		
			int j = 0;
		for(int i = 0; i<li.size(); i++){
			
			System.out.println(j+"--------"+li.get(i));
			
			j++;
		}

	}

}
