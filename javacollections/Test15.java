package javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class User {
	int user_id;
	String name;
	String email;
	
	public User(int user_id, String name, String email) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", email=" + email + "]";
	}	
}

class SortUserById implements Comparator<User>{

	@Override
	public int compare(User u1, User u2) {
		// TODO Auto-generated method stub
		return u1.user_id - u2.user_id;
	}	
}

class SortUserByName implements Comparator<User>{

	@Override
	public int compare(User u1, User u2) {
		// TODO Auto-generated method stub
		return u1.name.compareTo(u2.name);
	}	
}

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<User> ar = new ArrayList<User>();
		ar.add(new User(111, "Alex", "alex@gmail.com"));
		ar.add(new User(131, "Bob", "bob@gmail.com"));
		ar.add(new User(121, "Kevin", "kevin@gmail.com"));
		ar.add(new User(101, "Julie", "julie@gmail.com"));
		
		System.out.println("Unsorted : ");
		for(int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("=======================");
		
		Collections.sort(ar,new SortUserById());
		
		System.out.println("Sorted By User ID : ");
		for(int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}

}
