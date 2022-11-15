
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 20;
		int num2 = 30;
		
		System.out.println(num1 < 25 && num2 > 25); // cond1 && cond2 ---> true
		
		int res;
		res = ( num1 < num2)?num1:num2; //Ternary Operator
		System.out.println(res);
		
	}

}
