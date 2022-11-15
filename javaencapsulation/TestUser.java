package javaencapsulation;


public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User();
		user1.setUserName("john");
		user1.setPassword("123456");
		
		System.out.println(user1.getUserName() + " " + user1.getPassword());
		
		
		User user2 = new User();
		user2.setUserName("jimmy");
		user2.setPassword("123456");
		
		System.out.println(user2.getUserName() + " " + user2.getPassword());		
		
		
	}

}
