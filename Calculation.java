
public class Calculation {
	static int res; //global variable
	
	static void addition(int x,int y) {		
		res = x + y;
		System.out.println("sum of two numbers are : " + res);
	}
	
	static void substraction(int x,int y) {
		res = x - y;
		System.out.println("Difference of two numbers are : " + res);
	}
	
	static int multiplication(int x,int y) {
		res = x * y;
		return res;
	}
	
	static int division(int x,int y) {
		res = x / y;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition(30, 40); // 70
		substraction(40, 20); //20
		res = multiplication(20, 30);
		System.out.println("Multiplcatio of two numbers are : " + res); //600
		res = division(20, 5);
		System.out.println("Division of two numbers are : " + res); //4
	}
}
