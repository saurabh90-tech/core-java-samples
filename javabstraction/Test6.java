package javabstraction;

interface Billing{	
	abstract void invoice_amount();
}

//inheriting interface by implements

public class Test6 implements Billing{
	
	public void invoice_amount() {
		System.out.println("Total Invoice Amount is: 40000" );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test6 obj = new Test6();
		obj.invoice_amount();
	}

}
