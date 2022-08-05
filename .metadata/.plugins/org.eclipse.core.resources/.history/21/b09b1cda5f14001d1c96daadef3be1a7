package HW5;

public class BasePlusCommissionEmployeeExtV2 extends CommissionEmployeeExtV1{

	public double baseSalary;
	
	public BasePlusCommissionEmployeeExtV2(String fName,String lName,String idNumber,double grossSales,double CommissionRate,double baseSalary) 
	{
		super(fName,lName,idNumber,grossSales,CommissionRate);

		if(baseSalary <0.0) 
		{
			throw new IllegalArgumentException("薪資錯誤，員工 baseSalary 不可<0");
		}

		this.baseSalary=baseSalary;
		
	}
	public double earnings() 
	{
		return this.baseSalary+(getGrossSales()*getCommissionRate());		
	}
	public String toString() 
	{
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n%s: %.2f%n",
				"領傭金的員工姓名,",firstName,lastName,
				"身份證字號",idNumber,
				"銷售金額",getGrossSales(),//原本是grossSales
				"傭金比例",CommissionRate,
				"底薪",baseSalary,
				"薪資",this.earnings());
	}
}
