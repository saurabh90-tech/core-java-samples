package javaeightfeatures;

import java.util.Optional;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = new String[5];
		str[2] = "welcome to Java8- Optional class";
		Optional<String> empty = Optional.empty();
		System.out.println(empty);
		
		Optional<String> value = Optional.of(str[2]);
		System.out.println(value);
		
		
	}

}
