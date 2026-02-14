package com.exp;

public class Client {

	public static void main(String[] args) {

		int acno[] = {101,102,103,104,105};
		String names[] = {"king","smith","tom","javeed","ford"};
		double  balance[] = {5000.0,6000.0,40.0,7000.0,9000.0};
		
		
		System.out.println("Acno  Name  Balance");
		
			for (int i = 0; i < acno.length; i++) {
				
			System.out.println(acno[i] +"  "+names[i]+" "+balance[i]);
			
				if(balance[i]  < 1000) {
					
					try{
					
					throw  new  LowBalanceException();
					
					}catch(LowBalanceException e) {
						
					System.err.println("Sorry! , "+names[i]+ " your balance is low");
						
					}
					
				}
			
				
			}
		
		

	}

}
