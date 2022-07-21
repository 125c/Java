package Hello;

public class CommissionEmployeeExtV1 extends Object{
	public String firstName;
	public String lastName;
	public String idNumber;
	private double grossSales;//如果改私有BasePlusCommissionEmployeeExtV1會收不到
	public double CommissionRate;
	
	public CommissionEmployeeExtV1(String dsf) {
		this.firstName=dsf;
	}
	public CommissionEmployeeExtV1(String dsf,String dqwf,String qwe) {
		this.firstName=dsf;

	}
	public CommissionEmployeeExtV1() {
		this.lastName="jhkj";
	};
	public CommissionEmployeeExtV1(String fName,String lName,String idNumber,double grossSales,double CommissionRate) 
	{
		super();
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
			throw new IllegalArgumentException("基本資料錯誤，員工 first name 不可空白");
		}
		if(grossSales <0.0) 
		{
			throw new IllegalArgumentException("薪資錯誤，員工 grossSales 不可<0");
		}
		if((CommissionRate <0.0)||(CommissionRate >1.0)) 
		{
			throw new IllegalArgumentException("薪資錯誤，員工 CommissionRate 要在0～1之間");
		}
		this.firstName=fName;
		this.lastName=lName;
		this.idNumber=idNumber;
		this.grossSales=grossSales;
		this.CommissionRate=CommissionRate;

	}
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}


	public String getIdNumber() {
		return idNumber;
	}


	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		if(grossSales <0.0) 
		{
			throw new IllegalArgumentException("薪資錯誤，員工 grossSales 不可<0");
		}
		
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return CommissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if((commissionRate <0.0)||(commissionRate >1.0)) 
		{
			throw new IllegalArgumentException("薪資錯誤，員工 CommissionRate 要在0～1之間");
		}
		this.CommissionRate=commissionRate;
	}

		public double earnings() 
		{
			return this.grossSales=grossSales * this.CommissionRate;
			
		}
		public String toString() 
		{
			return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n",
					"領傭金的員工姓名,",firstName,lastName,
					"身份證字號",idNumber,
					"銷售金額",grossSales,
					"傭金比例",CommissionRate,
					"薪資",this.earnings());
		}
		
	
}
