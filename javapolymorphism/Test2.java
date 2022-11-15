package javapolymorphism;

class Calculation1{
	
	void add(int x,int y) {
		int res;
		res = x + y;
		System.out.println("sum of two numbers are : " + res);
	}
	
	void add(double x, double y) {
		double res;
		res = x + y;
		System.out.println("sum of two numbers are : " + res);
	}	
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation1 obj = new Calculation1();
		obj.add(20.01,29.99);
		obj.add(60,70);
	}
}
