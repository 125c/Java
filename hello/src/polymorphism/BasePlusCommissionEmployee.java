package polymorphism;

public class BasePlusCommissionEmployee extends CommissionEmployee{

	public double baseSalary;
	

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if(baseSalary <0.0) 
		{
			throw new IllegalArgumentException("薪資錯誤，員工 baseSalary 不可<0");
		}
		this.baseSalary = baseSalary;
	}

	public BasePlusCommissionEmployee(String fName,String lName,String idNumber,double grossSales,double CommissionRate,double baseSalary) 
	{
		super(fName,lName,idNumber,grossSales,CommissionRate);

		if(baseSalary <0.0) 
		{
			throw new IllegalArgumentException("薪資錯誤，員工 baseSalary 不可<0");
		}

		this.baseSalary=baseSalary;
		
	}
	@Override
	public double earnings() 
	{
//		return getBaseSalary()+(getGrossSales()*getCommissionRate());
		return getBaseSalary()+super.earnings();
	}
	
	@Override
	public String toString() 
	{
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n%s: %.2f%n",
				"領傭金的員工姓名,",super.toString(),
				"身份證字號",getIdNumber(),
				"銷售金額",getGrossSales(),
				"傭金比例",getCommissionRate(),
				"底薪",getBaseSalary(),
				"薪資",this.earnings());
	}
}
