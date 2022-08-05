package HW5;

public class HW5HourlyEmployee extends HW5CommissionEmployee implements Payable{
		public double hours;
		public double wage;

		public  HW5HourlyEmployee(String firstName,String lastName,double hours,double wage) 
		{
			super(firstName, lastName,hours,wage);
			setWage(wage);
			setHours(hours);
		}

		public double getHours() {
			return hours;
		}
		public void setHours(double hours) {
			if((hours<0)||(hours>=168)) 
			{
				throw new IllegalArgumentException("時數要>0&&<=168");
			}
			this.hours = hours;
		}
		public double getWage() {
				return wage;
		}
		public void setWage(double wage) {
			if(wage<0) 
			{
				throw new IllegalArgumentException("時薪要>0");
			}
			this.wage = wage;
		}

		@Override
		public double getPaymentAmount() {
			if(hours > 40) {
				return (getWage() * 40) + ((getHours() - 40 ) * (wage * 1.5));
			}else {
				return hours * wage;
			}
		}
	
		@Override
		public String toString() 
		{
//			return String.format("姓名:%s %s%n工時:%.2f%n時薪:%.2f%n總薪資:%.2f%n",
//					getFirstName(),getLastName(),getHours(),getWage(),getPaymentAmount() );
			return String.format("%s: %s %s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n",
					"領時薪的員工姓名",getFirstName(),getLastName(),
					"工時",getHours(),
					"時薪",getWage(),
					"總薪資",this.getPaymentAmount());
		}

}
