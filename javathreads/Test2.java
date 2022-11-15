package javathreads;

public class Test2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread started....");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 r = new Test2();
		Thread t1 = new Thread(r);
		t1.start();
			
	}

}
