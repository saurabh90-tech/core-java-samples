package javapolymorphism;
//Function Overriding
class Vehicle{
	void display(){
		System.out.println("Vehicle is running !!! ");
	}
}

class Bike extends Vehicle{
	void display() {
		System.out.println("Bike is running !!! ");
	}
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike obj = new Bike();
		obj.display();
	}
}
