package javaexceptions;

public class Test10 {

	static void validateAge(int age){
		if(age < 18) {
			throw new ArithmeticException("User not Eligible to vote !!! ");
		}else {
			System.out.println("User is Eligible to vote !!! ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		validateAge(17);
		System.out.println("done");
	}

}
