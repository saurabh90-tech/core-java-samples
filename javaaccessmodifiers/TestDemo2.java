package javaaccessmodifiers;

public class TestDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo1 obj = new TestDemo1();
		//System.out.println(obj.number); // TestDemo1.number is not visible
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.email);
	}

}
