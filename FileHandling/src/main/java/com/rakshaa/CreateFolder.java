package com.rakshaa;
import java.io.File;
public class CreateFolder {
	public static void main(String[] args) {
		
		File f = new File("my folder");
		
		boolean fstatus = f.mkdir();
		System.out.println(fstatus);
	}

}
