package co.stosh;

import java.util.Scanner;

public class Toyata {
		public int speed;
		public static int brake;
		
		
		public int accelerate(){
			return speed += 15;
		}
		
		
		
		public int brake(){
			return speed -= 5;
			
		}	
			
			
		
	public static void main(String[] args) {
		Toyata t1 = new Toyata();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your gear");
		
		int gear = s.nextInt();
		
		try{
			
			
			if(gear == 1){
				System.out.println("The speed of the car is " + t1.accelerate());
			}else if(gear == 2){
				t1.accelerate();
				System.out.println("The speed of the car is " + t1.accelerate());
			}else if(gear == 3){
				t1.accelerate();
				t1.accelerate();
				System.out.println("The speed of the car is " + t1.accelerate());
			}else if(gear == 4){
				t1.accelerate();
				t1.accelerate();
				t1.accelerate();
				System.out.println("The speed of the car is " + t1.accelerate());
			}
			
			
			System.out.println("Please brake the car");
			int brk = s.nextInt();
			
//			while(brake(true)){		
//			System.out.println("The speed of the car is "+  t1.brake());
//			if(t1.brake()== 0){
//				break;
//			}
//			}
				
				if(brk == 1){
					System.out.println("The speed of the car is "+ t1.brake());
				}else if(brk == 2){
					t1.brake();
					System.out.println("The speed of the car is "+ t1.brake());
				}
				else if(brk == 3){
					t1.brake();
					t1.brake();
					System.out.println("The speed of the car is "+ t1.brake());
				}else if(brk == 4){
					t1.brake();
					t1.brake();
				t1.brake();
					System.out.println("The speed of the car is "+ t1.brake());
				}
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	
	

	}



	private static boolean brake(boolean b) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
	



	