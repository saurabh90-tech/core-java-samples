package javathreads;

public class Test5 extends Thread{

	public void run() {
		for(int i = 1; i<= 5; i++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException ex) {
				
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 obj1 = new Test5();
		obj1.start();
		try {
			obj1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Test5 obj2 = new Test5();
		obj2.start();		
		
	}

}
