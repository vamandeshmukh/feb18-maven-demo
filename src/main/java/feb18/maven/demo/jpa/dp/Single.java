package feb18.maven.demo.jpa.dp;

public class Single {

	private static Single obj;

	private Single() {

	}

	public static Single getInstance() { // getInstance();
		if (obj == null) {
			obj = new Single();
			return obj;

		} else {
			return obj;
		}
	}

//	public static Single getSingle() { // getInstance();
//	return new Single();
//}

}
