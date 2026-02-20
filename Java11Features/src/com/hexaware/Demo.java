package com.hexaware;

import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {


			String str1 = "";
			
			System.out.println(str1.isBlank());
			
			

			String str2 = "Hexaware";
			
			System.out.println(str2.isBlank());
		
		
			 String str = "Geeks\nFor\nGeeks";
			 
			System.out.println(str);
			
			
		List<String>  list =	str.lines().collect(Collectors.toList());
		
				System.out.println(list);
				
				
				
			String name = "tom";
			
			System.out.println(name.repeat(3));
			
			String  data = "        Hello friends       "; 
			
			System.out.println(data.stripLeading());
			System.out.println(data.stripTrailing());
			System.out.println(data.strip());
			
			
	}

}
