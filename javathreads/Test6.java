package javathreads;

public class Test6 extends Thread {

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
		Test6 obj1 = new Test6();
		obj1.run();
		
		Test6 obj2 = new Test6();
		obj2.run();		
		
	}

}
