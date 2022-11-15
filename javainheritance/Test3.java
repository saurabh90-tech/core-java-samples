package javainheritance;

class Vehicle{
	int speed;
	String vehicleName;
	
	Vehicle(){
		System.out.println("Vehicle Default constructor invoked !!! ");
	}
	
	Vehicle(int speed,String vehcleName){
		this.speed = speed;
		this.vehicleName = vehcleName;
	}
	
	void getVehcileDetails(){
		System.out.println("Vehicle running at speed : " + this.speed + " " + "km/hr");
		System.out.println("Vehcile Name is : " + this.vehicleName);
	}
}

class Bike extends Vehicle{
	int bike_speed;
	
	Bike(){
		super();
		System.out.println("Default Bike constructor invoked !!!");
	}
	
	Bike(int bike_speed,String bikeName){		
		super(bike_speed,bikeName);
		this.bike_speed = bike_speed;
	}
	
	void getBikeDetails(){
		super.getVehcileDetails();
		System.out.println("Bike is running at speed : " + this.bike_speed + " " + "km/hr");
	}
	
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Bike();
		Bike bobj = new Bike(100,"Honda");
		bobj.getBikeDetails();
	}

}
