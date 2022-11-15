package javaeightfeatures;

public class Test2 implements Interface1,Interface2{	

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		System.out.println("Test logging::" + str);
		Interface1.print("welcome to java8 features!!!!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 obj = new Test2();
		obj.log("user logged in now ");
	
	}

}
