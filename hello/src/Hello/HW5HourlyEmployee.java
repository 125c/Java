package Hello;

public class HW5HourlyEmployee {

		public double hours;
		public double wage;
		
		public double getHours() {
			return hours;
		}
		public void setHours(int hours) {
			if(hours>0&&hours<=168) 
			{
				throw new IllegalArgumentException("時數要>0&&<=168");
			}
			this.hours = hours;
		}
		public double getWage() {
			return wage;
		}
		public void setWage(int wage) {
			this.wage = wage;
		}
		public HW5HourlyEmployee(int hours,int wage) 
		{
			
		}
		public double getPaymentAmount() 
		{
			return (getHours()*getWage());	
		}
}