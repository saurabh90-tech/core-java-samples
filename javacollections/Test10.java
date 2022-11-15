package javacollections;

import java.util.HashSet;
import java.util.Iterator;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("John");
		set.add("Alex");
		set.add("Alen");
		set.add("John");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
