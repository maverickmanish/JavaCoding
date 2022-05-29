package multiThreading;

class Transaction {
	private int totalAmmount;

	public Transaction() {
		this.totalAmmount = 10000;
	}

	synchronized public boolean withdraw(int withdrawl) {
		System.out.println("current balance : " + this.totalAmmount);
		System.out.println("withdraw amount : " + withdrawl);
		if (this.totalAmmount < withdrawl) {
			System.out.println("not sufficient Amount ... waiting for someone to deposit ...");
			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
		System.out.println("Updated current balance : " + this.totalAmmount);
		System.out.println("withdraw amount : " + withdrawl);
		
		if (this.totalAmmount >= withdrawl)
			return (this.totalAmmount -= withdrawl) == this.totalAmmount;
		else
			return false;

	}

	synchronized public void deposit(int amount) {
		System.out.println("going to deposit amount : " + amount);
		this.totalAmmount += amount;
		System.out.println("cash deposited !!! ");
		notify();

	}

}

public class TestDeadlockSolution {

	public static void main(String[] args) {
		Transaction t = new Transaction();
		new Thread() {
			public void run() {
				System.out.println("request to withdra 15000 amont ");
				System.out.println(t.withdraw(15000)?"withdrawn ":" declined");
			}
		}.start();
		new Thread() {
			public void run() {
				System.out.println("amount to be deposited : 6000 ");
				t.deposit(6000);
			}
		}.start();
		new Thread() {
			public void run() {
				System.out.println("amount to be deposited : 6000 ");
				t.deposit(6000);
			}
		}.start();

	}

}