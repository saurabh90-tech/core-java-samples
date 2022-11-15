package javaeightfeatures;

import java.util.ArrayList;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = new ArrayList<Integer>();
		for(int i = 1; i <= 10; i++) {
			myList.add(i);
		}
		
		myList.forEach(
				(i) -> System.out.println(i)
				);
	}

}
