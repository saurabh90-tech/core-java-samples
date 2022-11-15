package javaexceptions;

class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
}
public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Begin");
		try {
			throw new MyException("my custom exception");
		}catch(MyException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println("end");
		
	}

}
