package javainheritance;

//Multi-level Inheritance
class RBI{
	String rbi_roi = "7%";
	RBI(){
		System.out.println("Default constructor invoked !!! - RBI");
	}
}

class SBI extends RBI{
	String sbi_roi = "9%";
	SBI(){
		super();
		System.out.println("Default constructor invoked !!! - SBI");
	}
}

class HDFC extends SBI{
	String hdfc_roi = "11%";
	HDFC(){
		super();
		System.out.println("Default constructor invoked !!! - HDFC");
	}
	
	void getAllDetails(){
		System.out.println("RBI roi is : " + rbi_roi);
		System.out.println("SBI roi is : " + sbi_roi);
		System.out.println("HDFC roi is : " + hdfc_roi);
	}
}
public class Test4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC obj = new HDFC();
		obj.getAllDetails();
	}
}
