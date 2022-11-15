package javaconditions;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Enter Age:");
			
			Scanner sc = new Scanner(System.in);
			int age = sc.nextInt();			
			String res;			
			res = ( age >= 18) ? "Eligible to vote":"Not Eligible to Vote";
			System.out.println(res);			
	}
}
