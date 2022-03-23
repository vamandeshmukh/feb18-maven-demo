package feb18.maven.demo.jpa.dp;

public class SingletonDemo {

	public static void main(String[] args) {

//		Single obj3 = new Single();
//		Single obj2 = new Single();
//		System.out.println(obj.hashCode());
//		System.out.println(obj2.hashCode());
//		System.out.println(obj.equals(obj2));

		Single obj = Single.getInstance();
		Single obj2 = Single.getInstance();
		Single obj3 = Single.getInstance();
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj.equals(obj2));
		System.out.println(obj.equals(obj3));

	}

}
