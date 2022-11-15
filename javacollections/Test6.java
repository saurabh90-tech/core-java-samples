package javacollections;

import java.util.Iterator;
import java.util.Vector;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Vector<Integer> obj = new Vector<>();
			obj.add(10);
			obj.add(20);
			obj.add(30);
			obj.add(40);
			obj.add(50);
			
			Iterator<Integer> it = obj.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
	}

}
 