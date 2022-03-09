package feb18.maven.demo.lamb;

// lambda expression 

// to use abstract method(s) from an interface - 
//// 1. class implements interface 
//
//interface Int1 {
//
//	public abstract void m1();
//
////	public abstract void m2();
//}
//
//class Class1 implements Int1 {
//
//	@Override
//	public void m1() {
//		System.out.println("m1 used 1");
//	}
//
////	@Override
////	public void m2() {
////		System.out.println("m2 used 1");
////	}
//}
//
//public class App {
//
//	public static void main(String[] args) {
//
//		Class1 obj = new Class1();
//		obj.m1();
//	}
//}

////2. anonymous inner class   
//
//interface Int1 {
//
//	public abstract void m1();
//
//	public abstract void m2();
//}
//
//public class App {
//
//	public static void main(String[] args) {
//
//		Int1 obj = new Int1() {
//
//			@Override
//			public void m1() {
//				System.out.println("m1 used 2");
//			}
//
//			@Override
//			public void m2() {
//				System.out.println("m2 used 2");
//			}
//		};
//		obj.m1();
//	}
//}

//2. using lambda expression (only for a functional interface)
// lambda     () -> {} 
// functional interface - an interface that has only one abstract method 
// that abstract method is called as functional method 

@FunctionalInterface
interface Int1 {

//	public abstract void m1();
	public abstract void m1(int i);

//	public abstract void m2(); // not applicable 
}

public class App {

	public static void main(String[] args) {

//		Int1 obj = () -> {
//			System.out.println("m1 used 3");
//		};
//		obj.m1();

//		Int1 obj = (i) -> {
//			System.out.println("m1 used 3 " + i);
//		};
//		obj.m1(10);

		Int1 obj = i -> System.out.println("m1 used 3 " + i);

		obj.m1(10);

	}
}
