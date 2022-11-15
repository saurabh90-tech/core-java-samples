package javacollections;

import java.util.Iterator;
import java.util.LinkedList;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Alex");
		ll.add("Alen");
		ll.add("Julie");
		ll.add("Jack");
		ll.add("June");
		
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
