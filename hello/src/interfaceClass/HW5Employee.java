package interfaceClass;

public class HW5Employee extends Object{
	private String firstName;
	private String lastName;

	public HW5Employee(String firstName,String lastName) {
		super();		
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public String getFirstName() {
		if(firstName.equals("")) {
			throw new IllegalArgumentException("firstName不可為空白(ﾟ皿ﾟﾒ)");
		}
		return firstName;
	}

	public String getLastName() {
		if(lastName.equals("")) {
			throw new IllegalArgumentException("lastName不可為空白(ﾟ皿ﾟﾒ)");
		}
		return lastName;
	}
		public String toString() {
			return String.format("%n%s:%s%s%n",
					"姓名",getFirstName(),getLastName()
					);
		}
		
	}

