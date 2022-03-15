package feb18.maven.demo.mt;

//multi-threading with Runnable interface

public class App implements Runnable {

	public void printNums() {
//		Thread.currentThread().setPriority(9);
		System.out.println(Thread.currentThread().getPriority());
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " - " + Thread.currentThread().getName());
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

		Thread app = new Thread(new App());
		app.setPriority(9);
		app.start();
//		try {
//			app.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		Thread app2 = new Thread(new App());
		app2.setPriority(3);
		app2.start();
		Thread app3 = new Thread(new App());
		app3.setPriority(6);
		app3.start();

	}
}

//// multi-threading with Thread class 
//
//public class App extends Thread {
//
//	public void printNums() {
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
//	@Override
//	public void run() {
//		this.printNums();
//	}
//
//	public static void main(String[] args) {
//
//		App app = new App();
//		app.start();
//		App app2 = new App();
//		app2.start();
//		App app3 = new App();
//		app3.start();
//
//	}
//}

//// normal single threaded app 
//
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
