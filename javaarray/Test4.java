package javaarray;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
		int newArr[] = arr.clone();
		
		for(int i : newArr) {
			System.out.println(i);
		}
		
		
	}

}
