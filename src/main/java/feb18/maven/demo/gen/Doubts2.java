package feb18.maven.demo.gen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Doubts2 {

	public static void main(String[] args) {

		// code for int to Integer

		int[] a = { 22, 31, 9, 25, 77, 1 };

		List<Integer> list = new ArrayList<>();

		for (int x : a) {
			list.add(x);
		}

		Collections.sort(list);
		System.out.println(list.get(1));

	}

}
