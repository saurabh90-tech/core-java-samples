package oops;

class Person{
	 	int id = 101;
	    String name = "John";
	    int age = 23;
	    
	    void getPerson(){
	    	System.out.println(id + " " + name + " " + age);
	  }
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ClassName var_name = new ClassName();
		Person p = new Person();
		System.out.println(p.name);
		p.getPerson();

	}

}
