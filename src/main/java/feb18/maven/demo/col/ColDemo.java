package feb18.maven.demo.col;

import java.util.ArrayList;
import java.util.List;

// collection interfaces - 
// Collection, List, Set, Map, Queue, ...  

// collection classes - 
// ArrayList, LinkedList, Stack, Vector, HashSet, LinkedHashSet, TreeSet, HashMap, LinkedHashMap, TreeMap, ...  

public class ColDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		System.out.println(al.size());
		al.add(10);
		al.add(10.5);
		al.add("abc");
		System.out.println(al);
		System.out.println(al.size());
		al.add(25);
		System.out.println(al);
		System.out.println(al.size());
		al.remove(0);
		System.out.println(al);
		System.out.println(al.size());
//		al.
		List myList = new ArrayList();

	}

}
