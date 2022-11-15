package javacollections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("John");
		set.add("Alex");
		set.add("Alen");
		
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	}

}
