package oops;

public class Test5 {

	static int count = 0; //when count variable is static,it will get memory only once and retain its value
	
	Test5(){
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 obj1 = new Test5();
		Test5 obj2 = new Test5();
		Test5 obj3 = new Test5();
		
	}

}
