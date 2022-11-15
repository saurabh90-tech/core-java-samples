package javaconditions;
import java.util.Scanner;

//If- condition
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println("Enter Age:");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
//		System.out.println( age <= 18);		
		if(age >= 18) {
			System.out.println("Eligible to Vote!!! ");
		}else {
			System.out.println("Not Eligible to vote !!!");
		}
	}
}
