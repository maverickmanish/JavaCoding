package multiThreading;

class Childthread extends Thread {
	static Thread mainThread;

	public void run() {
		System.out.println("Child thread Execution ");
		try {
			mainThread.join();
			System.out.println("After joining with main thread");
			for (int i = 0; i < 10; i++) {
				System.out.println("child thread " + i);
				Thread.sleep(1000);
			}
			System.out.println("Child thread waiting for main thread to complete it's execution ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("child thread got interrupted ");
			e.printStackTrace();
		}
		System.out.println("normal program execution");
	}

}

public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Childthread c = new Childthread();
			System.out.println("in main thread");
			Childthread.mainThread = Thread.currentThread();
			c.start();
			for (int i = 0; i < 10; i++) {
				System.out.println("main thread " + i);
				Thread.sleep(1000);
			}
		
		} catch (InterruptedException ex) {
			System.out.println("Main method got interrupted !");
			ex.printStackTrace();
		}

	}

}
