package HW5;

public class HW5SalariedEmployee extends HW5Employee  implements Payable{
	public double salary;
	
	public HW5SalariedEmployee(String firstName, String lastName,double salary) {
		super(firstName, lastName);
		setSalary(salary);
	}

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
		return salary;
	}
	@Override
	public String toString() {
		return String.format("%s%s%s: %.2f%n",
				"領固定薪資的員工",super.toString(),
				"固定薪資",getPaymentAmount());
	}

}
