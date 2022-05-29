package shweta;

import java.util.Scanner;

class Employee {
	double salary;

	int noOfHoursWorkedPerday;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(double salary, int noOfHoursWorkedPerday) {
		super();
		this.salary = salary;
		this.noOfHoursWorkedPerday = noOfHoursWorkedPerday;
	}

	public void getInfo(double salary, int noOfHoursWorkedPerday) {
		this.salary = salary;
		this.noOfHoursWorkedPerday = noOfHoursWorkedPerday;

	}

	void addSal() {
		if (salary < 500)
			salary += 10;
	}

	public double getSalary() {
		return salary;
	}

	void AddWork() {
		if (noOfHoursWorkedPerday > 6)
			salary += 5;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", noOfHoursWorkedPerday=" + noOfHoursWorkedPerday + "]";
	}

}

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n\n Welcome ... Assignment No. 1 .....!!\n\n");
		Employee employee = new Employee();
		int ch;
		while (true) {
			System.out.println("\n\n 1. For Employee Initialization ");
			System.out.println(" 2. For Adition to Salary if it's less than $500");
			System.out.println(" 3. For Adition to Salary if the number of hours of work per day is more than 6 ");
			System.out.println(" 4. for Salary Display : ");
			System.out.println(" 5. for Exit : ");
			ch = scanner.nextInt();
			switch (ch) {
			case 1:
				employee.getInfo(400.00, 8);
				break;
			case 2:
				employee.addSal();
				break;
			case 3:
				employee.AddWork();
				break;
			case 4:
				System.out.println("Salary of the emoloyee is as follows : " + employee.getSalary());
				break;
			case 5:
				scanner.close();
				System.exit(0);
				break;

			}
		}

	}

}
