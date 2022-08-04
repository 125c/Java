package interfaceClass;

import Hello.Payable;

public class HW5SalariedEmployee extends HW5Employee  implements Payable{
	public HW5SalariedEmployee(String firstName, String lastName,double salary) {
		super(firstName, lastName);
		// TODO 自動產生的建構子 Stub
	}

	public double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary<0) 
		{
			throw new IllegalArgumentException("固定薪資<0也太沒良心了吧");
		}
		this.salary = salary;
	}

	@Override
	public double getPaymentAmount() {
		// TODO 自動產生的方法 Stub
		return 0;
	}
	@Override
	public String toString() {
		return String.format("%n%s固定薪資:%.2f",super.toString(),getSalary());
	}

}
