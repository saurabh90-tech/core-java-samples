package javathreads;

public class Test1 extends Thread {

	public void run() {
		System.out.println("Thread Started....");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 thread1 = new Test1();
		thread1.start();
//		thread1.start(); //we cannot same start thread twice
	}
}
