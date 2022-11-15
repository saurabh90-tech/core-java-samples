package javacollections;

import java.util.Arrays;

class Pair1 implements Comparable<Pair1>{
	String firstName;
	String lastName;
	
	public Pair1(String x,String y){
		this.firstName = x;
		this.lastName = y;
	}
	
	@Override
	public int compareTo(Pair1 a) {
		// TODO Auto-generated method stub
		if(this.firstName.compareTo(a.firstName) != 0) {
			return this.firstName.compareTo(a.firstName);
		}else {
			return this.lastName.compareTo(a.lastName);
		}
	}

	@Override
	public String toString() {
		return "Pair1 [firstName=" + firstName + ", lastName=" + lastName + "]";
	}	
	
}

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		Pair1 arr[] = new Pair1[n];
		arr[0] = new Pair1("raj", "kashup");
		arr[1] = new Pair1("rahul", "singh");
		arr[2] = new Pair1("alex", "dubey");
		arr[3] = new Pair1("rahul", "jetli");
		arr[4] = new Pair1("raj","z");
		Arrays.sort(arr);
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
