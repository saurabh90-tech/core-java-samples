package javastrings;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "hello";
		String s3 = " welcome";
		String s4 = " bye";
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		
		System.out.println(s1.concat(s3));
		System.out.println(s1); //strings are immutable
		
		s1 = s1.concat(s3);
		System.out.println(s1);
		
		System.out.println(s2.concat(s3).concat(s4));
		
	}

}
