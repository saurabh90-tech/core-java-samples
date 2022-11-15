package oops;

import java.time.LocalDate;
import java.time.Period;

class Employee{
	int emp_id = 101;
	String emp_name = "John";
	String emp_email = "john@gmail.com";
	String emp_dob = "2000-02-04";//yyyy-mm-dd
	
	void getEmployeeDetails() {
		System.out.println(emp_id + " " + emp_name + " " + emp_email + " " + emp_dob);
	}
	
	void calculateAge() {
		LocalDate dob = LocalDate.parse(emp_dob);
		LocalDate curDate = LocalDate.now();		
		System.out.println(emp_name + " " + "is" + " " + Period.between(dob, curDate).getYears() + " " + "Years Old");
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.getEmployeeDetails();
		e1.calculateAge();
	}
}
