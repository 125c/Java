package abstractClass;

public class WeekSalaryPlusCommissionEmployee extends  CommissionEmployee{
	private double WeekSalary;
	
	public double getWeekSalary() {
		return WeekSalary;
	}

	public void setWeekSalary(double weekSalary) {
		if(WeekSalary <0.0) 
		{
			throw new IllegalArgumentException("薪資錯誤，員工 WeekSalary 不可<0");
		}
		WeekSalary = weekSalary;
	}

	public WeekSalaryPlusCommissionEmployee(String fName,String lName,String idNumber,double grossSales,double CommissionRate,double WeekSalary) 
	{
		super(fName,lName,idNumber,grossSales,CommissionRate);
		setWeekSalary(WeekSalary);
	}
	@Override
	public double earnings() 
	{
		return (getWeekSalary()+super.earnings());	
	}
	@Override
	public String toString() 
	{
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n%s: %.2f%n",
				"領周薪+獎金的員工姓名,",getFirstName(),getLastName(),
				"身份證字號",getIdNumber(),
				"銷售金額",getGrossSales(),
				"獎金比例",getCommissionRate(),
				"周薪薪資",getWeekSalary(),
				"總薪資",this.earnings());
	}
}
