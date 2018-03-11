package com.stosh;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class M {

	public static void main(String[] args) {
		Map <Integer,String> m1 = new HashMap<>();
		
		m1.put(1, "Ram");
		m1.put(2, "R");
		m1.put(3, "m");
		m1.put(4, "a");
		
		Set<Integer> s1 = m1.keySet();
		
		for(int i = 1; i <= m1.size(); ++i){
			System.out.println(m1.get(i));
		}
		
	}

}
