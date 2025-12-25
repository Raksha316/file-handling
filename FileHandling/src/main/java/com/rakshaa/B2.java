package com.rakshaa;

import java.io.File;

public class B2 {
	public static void main(String[] args) {
		
		File f = new File("springboot.txt");
		
		try {
			boolean fstatus2 = f.createNewFile();
			System.out.println(fstatus2);
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
	}

}
