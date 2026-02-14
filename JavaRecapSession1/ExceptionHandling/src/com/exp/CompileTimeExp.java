package com.exp;

public class CompileTimeExp {

	public static void main(String[] args) {  // Main Thread

			int x = 99; // thread level variable

			
				System.out.println("Hello");
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				} 
				
				System.out.println("Thank you");
				
					
		

	}

}
