package javainheritance;

class Company{
	String company_name;
	String company_location;
	
	Company(){
		this.company_name = "IBM";
		this.company_location = "INDIA";
	}
	
	void getCompanyDetails(){
		System.out.println(company_name + " " + company_location);
	}
}

class Employee extends Company{
	int emp_id;
	String emp_name;
	
	Employee(){
		this.emp_id = 101;
		this.emp_name = "John";
	}
	
	void getEmpDetails(){
		System.out.println(this.emp_id + " " + this.emp_name);
	}
	
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.getCompanyDetails();
		e1.getEmpDetails();
	}

}
