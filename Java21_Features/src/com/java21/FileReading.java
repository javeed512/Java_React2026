package com.java21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReading {
	
	public static void main(String[] args) {
		
	
	
	
	 try {
         // Define the file path
         Path filePath = Paths.get("input.txt");

         // Read the file content into a string
         String content = Files.readString(filePath);

         System.out.println(content);

     } catch (IOException e) {
         // Handle file not found or other I/O errors
         e.printStackTrace();
     }
	 
	}

}
