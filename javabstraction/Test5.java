package javabstraction;

abstract class Employee{
	void empDetails(){
		System.out.println("Employee Details are : John from England");
	}
	
	abstract void salary();//abstract method
}
//inheriting class by extends
class HRDepartment extends Employee {
	void salary() {
		System.out.println("Salary Deatils: Rs 56000");
	}
}

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HRDepartment obj = new HRDepartment();
		obj.empDetails();
		obj.salary();
	}

}
