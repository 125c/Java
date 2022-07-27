package Hello;

public class HW4Shape {

	double area;
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		if(area<=0) {
			throw new IllegalArgumentException("輸入錯誤，area要>0");
		}
		this.area = area;
	}

	public HW4Shape(double area) {
		this.area=area;
	}
	public HW4Shape() {

	}

	@Override
	public String toString() 
	{
		return String.format("%s: %.2f%n",
				
				"面積",getArea());
	}
}