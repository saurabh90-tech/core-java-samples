package javaexceptions;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		int arr[] = {10,20,30,40,50};
				//   0  1  2  3  4
		try {
			System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
//			System.out.println("Exception Handled");
		}
		
		
		System.out.println(3);
	}

}
