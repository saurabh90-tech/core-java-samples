package javapolymorphism;
//polymorphism Function Overloading or Compile Time polymorphism
class Calculation{
	
	void addition(int x,int y) {
		int res;
		res = x + y;
		System.out.println("sum of two numbers are : " + res);
	}
	
	void addition(int x,int y,int z) {
		int res;
		res = x + y + z;
		System.out.println("sum of three numbers are : " + res);
	}
	
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation obj = new Calculation();
		obj.addition(20, 30, 40);
		obj.addition(60, 70);
	}

}
