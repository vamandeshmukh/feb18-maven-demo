package feb18.maven.demo.jpa.dp;

//// lazy initialization - better memory management 
//public class Single {
//
//	private static Single obj;
//
//	private Single() {
//
//	}
//
//	public static Single getInstance() {
//		if (obj == null)
//			obj = new Single();
//		return obj;
//	}
//
//}

//early initialization - faster execution 

public class Single {

	private static Single obj = new Single();

	private Single() {

	}

	public static Single getInstance() {
		return obj;
	}

}




