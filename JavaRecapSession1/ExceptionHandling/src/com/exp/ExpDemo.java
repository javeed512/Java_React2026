package com.exp;

public class ExpDemo {

	public static void main(String[] args) {// caller


		System.out.println("Open File ...");
		System.out.println("Read data from File..");
		
		System.out.println("Write data to the File...");
		
			try {
		
			int result =	div(10,2);
			System.out.println("Result: "+result);
			
			String name = "javeed";
			System.out.println(name.length());
			
			
			}
			catch(ArithmeticException | NullPointerException e) {
				
				//e.printStackTrace();
				
				System.err.println("Sorry!  something went wrong");
			}
			catch(Exception e) {
				
				e.printStackTrace();
				
			}
			
			finally {
				
				System.out.println("Save File...");
				
				System.out.println("Close File...");
				
				
			}
			
		
		
		

	}
	
	
	
	public static int div(int a , int b)throws ArithmeticException {// callee
		
		return a/b;
		
	}
	
	
	
	
	

}
