package Lab9.part2.prob10a;

import java.util.*;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
		System.out.println(someSimpleIsTrue(list));
	}
	
	public static boolean someSimpleIsTrue(List<Simple> list) {
		return list.stream()
				.map(simple -> simple.flag)
				.reduce(false, (accum,flag) -> accum || flag);
	}
}
