package com.rakshaa;
import java.io.File;
import java.io.IOException;
public class Test {
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
