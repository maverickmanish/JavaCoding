package multiThreading;

import java.util.Observable;
import java.util.Observer;

class MyThread extends Thread {

	public void run() {
		Thread.yield();
		for (int i = 0; i < 12; i++) {
			System.out.println("child thread");
			/*
			 * System.out.println(Thread.currentThread().getName());
			 * System.out.println(Thread.currentThread().getPriority());
			 * Thread.currentThread().setName("it's DON-" + i);
			 */}

	}
}

public class ThreadDemo {
	public static void main(String[] args) {

		MyThread t = new MyThread();
		/* t.setPriority(10); */
		System.out.println(t.getPriority());
		t.start();

		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 12; i++) {
			System.out.println("Main thread");
		}

		System.out.println("Observe the Observables !!!! ");

		BeingObserved beingObserved = new BeingObserved();
		Observer1 observer1 = new Observer1();
		beingObserved.addObserver(observer1);
		beingObserved.incre();

	}
}

class Observer1 implements Observer {
	public void update(Observable obj, Object arg) {
		System.out.println("Observer1 is added");
	}
}

// This is class being observed
class BeingObserved extends Observable {
	void incre() {
		setChanged();
		notifyObservers();
	}
}
