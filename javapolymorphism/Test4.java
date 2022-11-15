package javapolymorphism;
//parent class
class Billing{
	void calculate(int bill_amount,int discount_amt) {
		int total_amount;
		total_amount = bill_amount - discount_amt;
		System.out.println(total_amount);
	}
}
//child class
class Accounts extends Billing{
	//same as calculate method of Billing class
	void calculate(int bill_amount,int discount_amt) {
		int total_amount;
		int tax_amount = 200;
		total_amount = bill_amount - discount_amt + tax_amount;
		System.out.println(total_amount);
	}
}


//calculate function of Accounts class overrides the calculate function of billing class

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accounts obj = new Accounts();
		obj.calculate(1200, 200);
	}

}
