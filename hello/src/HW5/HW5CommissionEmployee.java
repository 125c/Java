package HW5;

public class HW5CommissionEmployee extends HW5Employee  implements Payable{
	public double grossSales;
	public double CommissionRate;

	public HW5CommissionEmployee(String firstName,String lastName,double grossSales,double CommissionRate) 
	{
		super(firstName,lastName);
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
		if((CommissionRate <0.0)||(CommissionRate >1.0)) 
		{
			throw new IllegalArgumentException("薪資錯誤，員工 CommissionRate 要在0～1之間");
		}
		CommissionRate = commissionRate;
	}
	@Override
	public double getPaymentAmount() {
		// TODO 自動產生的方法 Stub
		return this.grossSales * this.CommissionRate;
	}
	@Override
	public String toString() 
	{
		return String.format("%n%s銷售額:%.2f%n分潤比率:%.2f%n總薪資:%.2f%n%n",
				super.toString(),
				getGrossSales(),
				getCommissionRate(), 
				getPaymentAmount());
	}
}
