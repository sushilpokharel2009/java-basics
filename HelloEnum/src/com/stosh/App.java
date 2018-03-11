package com.stosh;

public class App {

	public static void main(String[] args) {
		Enum e = Enum.EAST;
		System.out.println(e);
		
		
		if(e == Enum.EAST){
			System.out.println("EAST");
		}
		
		
		C c1 = new C();
		System.out.println(c1.a);

	}

}
