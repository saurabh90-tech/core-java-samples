package javastrings;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "welcome to java";
		String[] words = s1.split("\\s");
		
		for(String s:words) {
			System.out.println(s);
		}
	}

}
