package javaeightfeatures;
//Lambda Expression : provides implementation of functional Interface(An interface has only one one abstract method)

interface Task{
	public String greet();
}

interface Calculation {
	public void sum(int x,int y);
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task obj = () -> {
			return "welcome to Lambda Expression in Java8";
		};
		
		System.out.println(obj.greet());
		
		System.out.println("============================");
		Calculation obj2 = (x,y) -> {
			//return x+y;
			System.out.println("sum of two numbers are : " + (x+y));
		};
		//System.out.println(obj2.sum(40, 40));
		obj2.sum(30, 40);
		
		
	}

}
