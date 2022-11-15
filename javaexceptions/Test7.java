package javaexceptions;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;
		System.out.println(1);
		try {
			System.out.println(name.length());
		}catch(ArithmeticException ex) {
			ex.printStackTrace();
		}catch(NullPointerException ex) {
			ex.printStackTrace();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(3);
	}

}
