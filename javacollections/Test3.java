package javacollections;

import java.util.ArrayList;
import java.util.Iterator;

class Demo{
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	void displayValues(){
		for(int i = 1; i <= 1000 ; i++) {
			al.add(i);
		}
				
		
		Iterator<Integer> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

public class Test3  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj = new Demo();
		obj.displayValues();
	}

}
