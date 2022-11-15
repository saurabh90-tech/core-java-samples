package javaeightfeatures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

//class MyConsumer implements Consumer<Integer>{
//
//	@Override
//	public void accept(Integer t) {
//		// TODO Auto-generated method stub
//		System.out.println("Consumer impl Value:: " + t);
//	}
//	
//}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = new ArrayList<Integer>();
		for(int i = 0; i< 10; i++) {
			myList.add(i);
		}
		
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println("Iterator value:: " + i);
		}	
		
		System.out.println("================================");
		//traversing through forEach method
		myList.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println("forEach anoymous class Value:: " + t);
			}
		});
	}

}
