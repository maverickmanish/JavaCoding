package multiThreading;

class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("Going To Withdraw...");
		if (this.amount < amount) {
			System.out.println("Less Balance; Waiting For Deposit...");
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		this.amount -= amount;
		System.out.println("Yeah! Withdraw Completed...");

	}

	synchronized void deposit(int amount) {
		System.out.println("Going To Deposit...");
		this.amount += amount;
		System.out.println("Deposit Completed... ");
		notify();
	}
}

public class TestDeadLockExample1 {
	public static void main(String args[]) {
		final Customer c = new Customer();
		Thread th = new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		};
		Thread th2 = new Thread() {
			public void run() {
				c.deposit(10000);
			}
		};
		th.start();
		th2.start();
	}
}