package com.stosh;

import java.util.StringTokenizer;

public class StTokenizer {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Hello,  this is the year 2017 for another lunatic year.");
		
		int  i = 0;
		
		while (st.hasMoreTokens()) {
			Object obj = (Object) st.nextToken();
			//System.out.println(obj);
			++i;
			System.out.println(i+" -------"+obj);
			//System.out.println(i);
		}
	}

}
