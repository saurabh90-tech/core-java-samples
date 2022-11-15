package javabstraction;

abstract class RBI{
	
	void transaction_limit(){
		System.out.println("Allowed 50000 only");
	}
	
	abstract void roi();//function without definition
}

class SBI extends RBI{
	void roi() {
		System.out.println("Rate of Interest in SBI is : 7%");
	}
}

class ICICI extends RBI{
	void roi() {
		System.out.println("Rate of Interest in ICICI is : 9%");
	}
}


public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI obj = new SBI();
		obj.roi();
		obj.transaction_limit();
	}

}
