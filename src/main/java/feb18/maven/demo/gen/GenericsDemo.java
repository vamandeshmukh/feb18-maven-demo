package feb18.maven.demo.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GenericsDemo {

	public List<Integer> m1(Set<Integer> empSet) {
		return null;
	}

	public static void main(String[] args) {

		// generics

		// type-safety

		List<Integer> list = new ArrayList<>();
//		List<Integer> list = new ArrayList<>();
		list.add(10);
//		list.add("abc");
//		list.add(10.5);

		System.out.println(list);

	}

}
