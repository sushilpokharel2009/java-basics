package co.rel;

import java.util.Scanner;

public class Honda {
	
	
	public int speed;
	//public static int gearChange;
	public  int brake;
	
	public int accelerate(){
		return speed += 5;
	}
	
	public int brake(){
		return speed -= 5;
	}
	

	public static void main(String[] args) {
		
		Honda h1 = new Honda();
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your gear number ");
		
		
		 int gearChange = s.nextInt()	;	

			
			
			if(gearChange == 1){
			
				System.out.println( "The speed of the car is"+ h1.accelerate());
			}else if(gearChange == 2){
				h1.accelerate();
				 System.out.println("The speed of the car is"+ h1.accelerate());
			}else if(gearChange == 3){
				h1.accelerate();
				h1.accelerate();
				 System.out.println("The speed of the car is"+ h1.accelerate());
			}else if(gearChange == 4){
				h1.accelerate();
				h1.accelerate();
				h1.accelerate();
				 System.out.println("The speed of the car is"+ h1.accelerate());
			}
			
			
			while(brake(true)){
				System.out.println(h1.brake());
				if(h1.brake()==0){
					break;
				}
			}
	}

		private static boolean brake(boolean b) {
			// TODO Auto-generated method stub
			return true;
		}
	
	
	

}
