package immutbale;

import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		String[] s= {"ajay","vijay","sagar"};
		
		System.out.println(s);
		
		List l = Arrays.asList(s);
		
		System.out.println(l);
		
		System.out.println(l.get(2));
		
		System.out.println(l);
	}

}
