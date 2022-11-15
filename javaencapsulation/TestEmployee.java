package javaencapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setEmp_id(101);
		e1.setEmp_name("Alex");
		e1.setEmp_age(21);
		
		System.out.println(e1.getEmp_id()  + " " + e1.getEmp_name() + " " + e1.getEmp_age());
	}

}
