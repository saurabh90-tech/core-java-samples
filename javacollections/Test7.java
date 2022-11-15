package javacollections;

import java.util.Iterator;
import java.util.Stack;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		stack.pop();
		
		Iterator<Integer> it = stack.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
