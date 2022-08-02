package interfaceClass;

public class CommissionEmployee extends Employee{
//	public String firstName;
//	public String lastName;
//	public String idNumber;
	public double grossSales;
	public double CommissionRate;
	

	public CommissionEmployee(String fName,String lName,String idNumber,double grossSales,double CommissionRate) 
	{
		super(fName,lName,idNumber);
		
		if(grossSales <0.0) 
		{
			throw new IllegalArgumentException("薪資錯誤，員工 grossSales 不可<0");
		}
		if((CommissionRate <0.0)||(CommissionRate >1.0)) 
		{
			throw new IllegalArgumentException("薪資錯誤，員工 CommissionRate 要在0～1之間");
		}

		this.grossSales=grossSales;
		this.CommissionRate=CommissionRate;

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

		public double getPaymentAmount() //原本是earnings()
		{
			return this.grossSales=grossSales * this.CommissionRate;
		}
		@Override
		public String toString() 
		{
			return String.format("%s: %s%s: %.2f%n%s: %.2f%n%s: %.2f%n",
					"領傭金的",super.toString(),
					"銷售金額",getGrossSales(),
					"傭金比例",getCommissionRate(),
					"薪資",this.getPaymentAmount());
		}
		
	
}
