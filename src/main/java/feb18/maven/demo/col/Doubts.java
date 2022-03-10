package feb18.maven.demo.col;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Doubts {

	public static void main(String[] args) {

////		10; // int Integer 
//		Integer num = Integer.valueOf(10); // boxing
//		System.out.println(num);
//		Integer num2 = 20; // autoboxing
//		System.out.println(num2);
//		int num3 = num2.intValue(); // unboxing
//		System.out.println(num3);
//		int num4 = num2; // autounboxing
//		System.out.println(num4);

////		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
//		HashMap<Integer, String> hm = new HashMap<>();
//
//		hm.put(10, "Ten");
//		hm.put(30, "Thirty");
//		hm.put(20, "Twenty");
//		hm.put(40, "Foutry");
//		System.out.println(hm);
//		hm.replaceAll((key, value) -> {
//			return value.toUpperCase();
//		});
//		System.out.println(hm);
//		hm.replaceAll((key, value) -> {
//			return value.toLowerCase();
//		});
//		System.out.println(hm);

//		ArrayList<Integer> myList = new ArrayList<>();
//		myList.add(10);
//		myList.add(13);
//		myList.add(9);
//		myList.add(11);
//		myList.add(22);
//		myList.add(31);
//		myList.add(5);
//		System.out.println(myList);
//		List<Integer> sl = myList.subList(2, 5);
//		System.out.println(sl);

//		Vector<Integer> vector2 = new Vector<>();
//		ArrayList<Integer> al2 = vector2;
//		ArrayList<Integer> list = new ArrayList<>();
//		System.out.println(list.size());
//		System.out.println(list);
//		System.out.println(list.capacity()); // NA 

//		Vector<Integer> vector = new Vector<>();
//		System.out.println(vector.size());
//		System.out.println(vector.capacity());
//		System.out.println(vector);
//		for (int i = 10; i <= 100; i += 10) {
//			vector.add(i);
//		}
//		System.out.println(vector.size());
//		System.out.println(vector.capacity());
//		System.out.println(vector);
//		for (int i = 5; i <= 25; i += 5) {
//			vector.add(i);
//		}
//		System.out.println(vector.size());
//		System.out.println(vector.capacity());
//		System.out.println(vector);

//		ArrayList<Integer> myList = new ArrayList<>();
//		myList.add(10);
//		myList.add(13);
//		myList.add(9);
//		myList.add(11);
//		myList.add(22);
//		myList.add(31);
//		myList.add(5);
//		System.out.println(myList);
//
//		System.out.println("Iterate with for loop");
//		for (int i = 0; i < myList.size(); i++)
//			System.out.println(myList.get(i));
//
//		System.out.println("Iterate with for each loop");
//		for (Integer i : myList)
//			System.out.println(i);
//
//		System.out.println("Iterate with Iterator");
//
//		Iterator<Integer> it = myList.iterator();
//
//		while (it.hasNext())
//			System.out.println(it.next());
//
////		System.out.println("Iterate with forEachRemaining()");
////		it.forEachRemaining(e -> System.out.println(e));
//
//		System.out.println("Iterate with forEach()");
//		myList.forEach(e -> System.out.println(e));

//		Collection<Integer> myList = new ArrayList<>();
//		List<Integer> myList = new ArrayList<>();
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(10);
		myList.add(13);
		myList.add(9);

	}

}
