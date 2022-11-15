package javabstraction;

//Multiple Inheritance
public class Test4 implements Task1,Task2{

	public void scanning() {
		System.out.println("scanning...");
	}
	
	public void printing() {
		System.out.println("Printing...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 obj = new Test4();
		obj.printing();
		obj.scanning();
	}

}
