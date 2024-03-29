package HW5;

public class HW5Employee extends Object implements Payable{
	private String firstName;
	private String lastName;
	
	public double getPaymentAmount() {
		return 0;
	}

	public void setFirstName(String firstName) {
		if(firstName.equals("")) {
			throw new IllegalArgumentException("firstName不可為空白(ﾟ皿ﾟﾒ)");
		}
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		if(lastName.equals("")) {
			throw new IllegalArgumentException("lastName不可為空白(ﾟ皿ﾟﾒ)");
		}
		this.lastName = lastName;
	}

	public HW5Employee(String firstName,String lastName) {
		super();		
		this.firstName=firstName;
		this.lastName=lastName;
	}

	public HW5Employee(double grossSales, double commissionRate) {
		// TODO 自動產生的建構子 Stub
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	@Override
		public String toString() {
			return String.format("%n%s:%s%s%n",
					"姓名",getFirstName(),getLastName()
					);
		}
		
	}

