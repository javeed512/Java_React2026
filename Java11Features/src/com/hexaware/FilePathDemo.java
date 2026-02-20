package com.hexaware;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilePathDemo {

	public static void main(String[] args) {


		 try {
			 
		String data =	Files.readString(Path.of("input.txt"));
			
			System.out.println(data);
			
			
		boolean   isSame  = Files.isSameFile(Path.of("input.txt"), Path.of("input.txt"));
			
		
				System.out.println(isSame);
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
