package oopsconcept;

public  class AreaOfCircle{
	private double radius;
	public AreaOfCircle(double radius){
		this.radius=radius;
	}
	//method to calculate area
	public double areaofcifcle() {
		return Math.PI *radius*radius;
	}
	public double circumtemceofcircle() {
		return 2*Math.PI*radius;
	}
	public void displayinfo() {
		 System.out.println("Radius: " + radius);
		System.out.println("Area of a Circle is: "+areaofcifcle());
		System.out.println("Circumference: " +circumtemceofcircle() );
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	AreaOfCircle circle=new AreaOfCircle(5.0);
circle.displayinfo();
	}

}
