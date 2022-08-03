package Hello;

public class HW5HourlyEmployee extends HW5Employee implements Payable{

		public  HW5HourlyEmployee(String firstName,String lastName,double hours,double wage) 
		{
			super(firstName, lastName);
			setWage(wage);
			setHours(hours);
		}

		public double hours;
		public double wage;

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
			return String.format("姓名:%s %s%n工時:%.2f%n時薪:%.2f%n總薪資:%.2f%n",
					getFirstName(),getLastName(),getHours(),getWage(),getPaymentAmount() );
		}

}
