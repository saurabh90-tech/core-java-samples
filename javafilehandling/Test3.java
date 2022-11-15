package javafilehandling;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File obj = new File("logs.txt"); //creates a new file
		 try {
		    	FileWriter writer = new FileWriter(obj);		    	
		    	
		    	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		    	Date date = new Date();
		    	System.out.println("user logged in at : " + df.format(date));
		    	writer.write("User Logged In at:  " + df.format(date));
		    	writer.close();
		    	System.out.println("Data Written Successfully");
		    }catch(Exception ex) {
		    	ex.printStackTrace();
		    }
	}

}
