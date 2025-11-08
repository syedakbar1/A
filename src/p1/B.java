package p1;

import java.util.HashMap;
import java.util.Map;

public class B {
	
	

	/*public static void main(String[] args) {
		

		Map<String, Object> test = new HashMap<>();
		
		test.put("A", "null");
		test.put("B", null);
		test.put(null, "D");
		test.put(null, "F");
		
		System.out.println(test);
	

	}*/
	
	public static void main(String[] args) {
		
		A a1 = A.getInstanceOfA();
		A a2 = A.getInstanceOfA();
		
		System.out.println("a1 & a2 ---> "+a1+" "+a2);
		Boolean s = a1==a2;
		System.out.println("a1 & a2 ---> "+s);

	}

}


/*chocolate

first non repeating character from given string
i/p-chocolate
o/p-h*/