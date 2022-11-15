package samples;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,value = 0;
		int flag = 0;
		
		int num = 1;
		value = num/2;
		
		if(num == 0 || num == 1) {
			System.out.println(num + " is not a prime number");
		}else {
			for (i = 2; i <= value; i++) {
				if(num % i == 0) {
					System.out.println(num + " is not a prime number");
					flag = 1;
					break;
				}
			}
			
			if(flag == 0) {
				System.out.println(num + "is a prime number");
			}
		}
	}
}
