package javastrings;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] cArr = {'w','e','l','c','o','m','e'};
		System.out.println(String.copyValueOf(cArr));
		
		String msg = "welcome";
		System.out.println(msg);
		
		
		String s = new String("welcome");
		System.out.println(s);
		
		System.out.println("String length is: " + s.length());
		System.out.println("Char at position : " + s.charAt(3));
		
		System.out.println(s.toUpperCase());
		
		String s1 = "BYE";
		System.out.println(s1.toLowerCase());
	}

}
