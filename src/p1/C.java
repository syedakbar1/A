package p1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class C {
	
	public static void main(String[] args) {
		//sorted, filter , Map
		List<Integer> numbers = Arrays.asList(1,3,4,5,0,2);
		
		//sorting of numbers
		List<Integer> collect = numbers.stream().sorted().collect(Collectors.toList());
		
		System.out.println(collect);
		
		collect=numbers.stream().sorted().filter(s->s%2==0).collect(Collectors.toList());
		
		System.out.println(collect);
		
		collect=numbers.stream().sorted().filter(s->s%2!=0).collect(Collectors.toList());
		
		System.out.println(collect);
		
		collect=numbers.stream().sorted().map(s->s*s).collect(Collectors.toList());
		
		System.out.println(collect);
		
		List<String> string = Arrays.asList("syed","akbar","hajira","aslam","akbar","syed");
		
		List<String> strCollect = string.stream().sorted().collect(Collectors.toList());
		
		System.out.println(strCollect);
		
		strCollect=string.stream().sorted().filter(s->s.equals("syed")||s.equals("akbar")).collect(Collectors.toList());

		System.out.println(strCollect);
		
		strCollect=string.stream().sorted().filter(s->s.startsWith("s")).collect(Collectors.toList());

		System.out.println(strCollect);
		
		strCollect=string.stream().sorted().filter(s->s.endsWith("r")).collect(Collectors.toList());

		System.out.println(strCollect);
		
		strCollect=string.stream().sorted().map(s->s.toLowerCase()).collect(Collectors.toList());

		System.out.println(strCollect);
		
		strCollect=string.stream().sorted().map(s->s.toUpperCase()).collect(Collectors.toList());

		System.out.println(strCollect);
		
		String join = String.join(",",numbers.stream().sorted().map(s->s.toString()).collect(Collectors.toList()));
		
		System.out.println(join);
		
		C c1=new C();
		
		Optional<C> val = Optional.ofNullable(c1);
		
		boolean present = val.isPresent();
		
		System.out.println(present);
		
		
	}
	
	

}
