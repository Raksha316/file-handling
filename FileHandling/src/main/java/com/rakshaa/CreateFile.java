package com.rakshaa;
import java.io.File;
import java.io.IOException;
public class CreateFile {
	public static void main(String[] args) {
		
		File f = new File("Prasoon.txt");
		    
		 try {
			boolean fstatus = f.createNewFile();
			System.out.println(fstatus);
		} 
		 
		catch (Exception e) {
			System.out.println(e);		}
	}

}
