package javathreads;

public class Test3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread obj = new Thread("Scanning");	
		obj.start();
		String threadName = obj.getName();
		System.out.println(threadName);
		
	}

}
