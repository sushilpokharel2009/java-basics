package co.stosh;

public class A implements Runnable{
	int balance = 500;
	
	@Override
	public void run() {
		
		withdraw(1);
		System.out.println(Thread.currentThread().getName());
		
	}
	
	public synchronized void withdraw(int a){
		
		balance = balance - a;
		System.out.println("Your rermaining balance is "+ balance);
		System.out.println("Cause You withdraw "+ a);
		
	}

	public static void main(String[] args) {
		A a1 = new A();
		
		Thread t1 = new Thread(a1);
		t1.setName("Ram");
		t1.start();
			
	}

	

}
