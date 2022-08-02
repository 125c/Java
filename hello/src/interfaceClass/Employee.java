package interfaceClass;

public abstract class Employee extends Object implements Payable{
	//新增implements Payable
	private String firstName;
	private String lastName;
	private String idNumber;
	
//	public abstract double earnings(); 用getPaymentAmount();取代earnings();
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getIdNumber() {
		return idNumber;
	}
	public Employee(String fName,String lName,String idNumber) 
	{   super();
		if(fName.equals("")) 
		{
			throw new IllegalArgumentException("基本資料錯誤，員工 first name 不可空白");
		}
		if(lName.equals("")) 
		{
			throw new IllegalArgumentException("基本資料錯誤，員工 last name 不可空白");
		}
		if(idNumber.equals("")) 
		{
			throw new IllegalArgumentException("基本資料錯誤，員工 idNumber 不可空白");
		}
		this.firstName=fName;
		this.lastName=lName;
		this.idNumber=idNumber;
		
//		System.out.println("this.firstName :"+this.firstName);

	}
	@Override
	public String toString() 
	{
		return String.format("%s: %s %s%n%s: %s%n",
				"姓名",getFirstName(),getLastName(),
				"身份證字號",getIdNumber()
				);
	}

}
