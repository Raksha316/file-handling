package com.rakshaa;
import java.io.File;
import java.io.IOException;
public class B3 {
	public static void main(String[] args) {
		
		File f = new File("PrassonBidua.txt");
		    
		 try {
			boolean fstatus3 = f.createNewFile();
			System.out.println(fstatus3);
		} 
		 
		catch (Exception e) {
			System.out.println(e);		}
	}

}
