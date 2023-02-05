package multiThreading;

class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("Going To Withdraw...");
		if (this.amount < amount) {
			System.out.println("Less Balance; Waiting For Deposit...");
			try {
				Thread.sleep(3000);
				System.out.println("Going To Withdraw amount : "+amount+ " from existing balance : "+this.amount);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		
		this.amount -= amount;
		System.out.println("withdrawn amount : "+amount+ " leaving balance : "+this.amount);
		System.out.println("Yeah! Withdraw Completed...");

	}

	synchronized void deposit(int amount) {
		System.out.println("Going To Deposit amount : "+amount+ " to existing balance : "+this.amount);
		this.amount += amount;
		System.out.println("deposited amount : "+amount+ " & new balance : "+this.amount);
		System.out.println("Deposit Completed... ");
		
	}
}

public class TestDeadLockExample1 {
	public static void main(String args[]) {
		final Customer c = new Customer();
		Thread th = new Thread(() -> c.withdraw(15000));
		Thread th2 = new Thread(() -> c.deposit(15000));
		th.start();
		th2.start();
	}
}