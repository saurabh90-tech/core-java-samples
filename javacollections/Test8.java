package javacollections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Alex");
		queue.add("Alen");
		queue.add("John");
		queue.add("Jimmy");
		queue.add("julie");

		
		Iterator<String> it = queue.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
