package javacollections;

import java.util.Iterator;
import java.util.TreeSet;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> obj = new TreeSet<String>();
		obj.add("Alex");
		obj.add("Alen");
		obj.add("Zues");
		
		Iterator<String> it = obj.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
