package javaconditions;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Percentage:");
		Scanner sc = new Scanner(System.in);
		int percentage = sc.nextInt();			
		
		
		if(percentage >= 85 && percentage<= 100) {
			System.out.println("FCD");
		}else if(percentage >= 60 && percentage < 85) {
			System.out.println("First Class");
		}else if(percentage >= 35 && percentage < 60) {
			System.out.println("Pass");
		}else if(percentage >=0 && percentage < 35) {
			System.out.println("Fail");
		}else {
			System.out.println("Enter Percentage between 0 and 100");
		}
	}
}
