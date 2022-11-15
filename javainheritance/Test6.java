package javainheritance;

class Sports{
	String sport_name;
	public Sports(String sport_name) {
		super();
		
		this.sport_name = sport_name;
		System.out.println("Sports constructor");
	}	
	void getSportDetails(){
		System.out.println(this.sport_name);
	}	
}

class BasketBall extends Sports{

	public BasketBall(String sport_name) {
		super(sport_name);
		System.out.println("BasketBall constructor");
		// TODO Auto-generated constructor stub
	}	
}

class Hockey extends Sports{

	public Hockey(String sport_name) {
		super(sport_name);
		System.out.println("Hockey constructor");
		// TODO Auto-generated constructor stub
	}	
}

class BaseBall extends BasketBall{

	public BaseBall(String sport_name) {
		super(sport_name);
		System.out.println("BaseBall constructor");
		// TODO Auto-generated constructor stub
	}
	
}

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseBall baseball = new BaseBall("BasketBall");
		baseball.getSportDetails();		
	}
}
