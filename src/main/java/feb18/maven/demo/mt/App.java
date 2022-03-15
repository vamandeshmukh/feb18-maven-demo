package feb18.maven.demo.mt;

// multi-threading with Thread class 

public class App extends Thread {

	public void printNums() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		this.printNums();
	}

	public static void main(String[] args) {

		App app = new App();
		app.start();
		App app2 = new App();
		app2.start();
		App app3 = new App();
		app3.start();

	}
}

// normal single threaded app 

//public class App {
//
//	public void printNums() {
//
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(250);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//
//		App app = new App();
//		app.printNums();
//		App app2 = new App();
//		app2.printNums();
//		App app3 = new App();
//		app3.printNums();
//
//	}
//}
