package oops;

class Student{
	int roll_no;
	String student_name;
    int age;
    static String university = "VTU";
    
    //default constructor
    public Student() {
		// TODO Auto-generated constructor stub
    	System.out.println("Default constructor gets executed !!! ");
	}
    
    //Parameterized constructor
    Student(int roll_no,String student_name,int age){    	
    	//this is a java keyword which refers current class properties variables
    	this.roll_no = roll_no;
    	this.student_name = student_name;
    	this.age = age;    	
    }
    
    void getStudentDetails(){
    	System.out.println(this.roll_no + " " + this.student_name + " " + this.age + " " +  university);
    }    
	
}
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(101,"John",21);
		s1.getStudentDetails();
		
		Student s2 = new Student(102,"Jimmy",22);
		s2.getStudentDetails();
	}

}
