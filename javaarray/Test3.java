package javaarray;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] frmArr = {'a','b','c','d','e','f'};
		            //    0   1   2   3   4   5
		
		char[] toArr = new char[6];
		
		System.arraycopy(frmArr, 0, toArr, 0, 4);
		System.out.println(String.valueOf(toArr));
		
	}

}
