package javacollections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> dq =new ArrayDeque<String>();
		dq.add("Alex");
		dq.add("Alen");
		dq.add("John");
		dq.addLast("Zeus");
		
		Iterator<String> it = dq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
