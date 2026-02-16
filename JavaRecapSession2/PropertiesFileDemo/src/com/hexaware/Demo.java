package com.hexaware;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Demo {

	public static void main(String[] args) {



		try {
			FileReader fr = new FileReader("src/application.properties");
			
				Properties  prop = new Properties();
				
				
			prop.load(fr);
			
			String username = prop.getProperty("username");
			String password = prop.getProperty("password");
			String city =  prop.getProperty("city.name");
			
			String mno = prop.getProperty("mno");
			
			
			System.out.println(username);
			System.out.println(password);
			System.out.println(city);
			System.out.println(mno);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
