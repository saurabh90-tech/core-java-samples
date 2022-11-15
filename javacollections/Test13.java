package javacollections;

import java.util.Arrays;

class Pair implements Comparable<Pair>{
	String x;
	int y;
	
	@Override
	public int compareTo(Pair a) {
		// TODO Auto-generated method stub
		if(this.x.compareTo(a.x)!= 0) {
			return this.x.compareTo(a.x);
		}else {
			return this.y - a.y;
		}		
	}
	
	Pair(String x,int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Pair [x=" + x + ", y=" + y + "]";
	}	
}

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		Pair arr[] = new Pair[n];
		
		arr[0] = new Pair("zz", 3);
		arr[1] = new Pair("a", 4);
		arr[2] = new Pair("bc", 5);
		arr[3] = new Pair("a", 2);
		arr[4] = new Pair("abc",3);
		arr[5] = new Pair("a",1);
		
		Arrays.sort(arr);
		
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
