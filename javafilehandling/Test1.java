package javafilehandling;

import java.io.File;
import java.io.FileWriter;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File obj = new File("info.txt");
		System.out.println("File created !!! " + obj.getAbsolutePath());
		System.out.println(obj.getName());
		
	    try {
	    	FileWriter writer = new FileWriter(obj);
	    	writer.write("welcome to Java - File Handling !!! ");
	    	System.out.println("written into file successfully");
	    	writer.close();
	    }catch(Exception ex) {
	    	ex.printStackTrace();
	    }
	}
}
