package javathreads;

public class Test4 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 obj = new Test4();
		Thread t1 = new Thread(obj,"scanning...");
		t1.start();
		String threadName = t1.getName();
		System.out.println(threadName);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread started..");
	}

}
