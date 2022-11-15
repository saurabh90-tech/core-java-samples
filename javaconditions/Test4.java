package javaconditions;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weekday = 7;
		
		switch(weekday) {
				case 1: 
					System.out.println("Monday");
					break;						
						
				case 2: 
					System.out.println("Tuesday");
					break;
					
				case 3: 
					System.out.println("Wednesday");
					break;
					
				case 4: 
					System.out.println("Thurusday");
					break;
					
				case 5: 
					System.out.println("Friday");
					break;
					
				case 6: 
					System.out.println("Saturday");
					break;
					
				case 7: 
					System.out.println("Sunday");
					break;
					
				default:
					System.out.println("Enter Weekday between 1 and 7");
					break;
		}
	}

}
