package oops;

public class Test6 {

	int number = 200;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To access non static property within a static block we make use of Objects.
		Test6 obj = new Test6();
		System.out.println(obj.number);		
	}

}
