package com.rakshaa;
import java.io.File;
import java.io.IOException;
public class B1 {
	public static void main(String[] args) {
		
		File f = new File("java.txt");
		    
		 try {
			boolean fstatus = f.createNewFile();
			System.out.println(fstatus);
		} 
		 
		catch (Exception e) {
			System.out.println(e);		
			}
	}

}
