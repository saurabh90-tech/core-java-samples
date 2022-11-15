package javathreads;

public class Test7 extends Thread{

	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread");
		}else {
			System.out.println("User Thread");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test7 t1 = new Test7();
		Test7 t2 = new Test7();
		Test7 t3 = new Test7();
		
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		
	}

}
