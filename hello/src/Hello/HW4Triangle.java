package Hello;

public class HW4Triangle extends HW4Shape{

	public double base;
	public double height;

	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public HW4Triangle(double base,double height) 
	{
		if(base<0 && height<0) 
		{
			throw new IllegalArgumentException("長寬不可<0");
		}
		this.base=base;
		this.height=height;
		ComputeArea();
	}
	public void ComputeArea() 
	{
		setArea((getBase()*getHeight())/2);
	}

	@Override
	public String toString() 
	{
		return String.format("Triangle  %s: %.2f%n",
				"面積",getArea());
	}
	
	
}