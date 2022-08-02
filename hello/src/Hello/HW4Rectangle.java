package Hello;

public class HW4Rectangle extends HW4Shape{

	private double lengh;
	public double width;
	
	
	

	public HW4Rectangle(double lengh,double width) 
	{
		if(lengh<0 && width<0) 
		{
			throw new IllegalArgumentException("長寬不可<0");
		}
		this.lengh=lengh;
		this.width=width;
		ComputeArea();
	}
	
	public double getLengh() {
		return lengh;
	}


	public void setLengh(double lengh) {
		this.lengh = lengh;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}

	public void ComputeArea() 
	{
		super.setArea(getLengh()*getWidth());
	}

	@Override
	public String toString() 
	{
		return String.format("Rectangles %s: %.2f%n",
				"面積",super.getArea());
	}
	
	
}