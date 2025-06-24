package constructors;
import java.util.Scanner;
public class Circle {
private double radius;
Circle(){
	radius=0.0;
}
Circle(double radius){
	this.radius=radius;
}
public void displayDetails() {
	System.out.println("Radius of a Circle: "+radius+"cm");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of a circle: 4");
		double radius=sc.nextDouble();
		
Circle circle=new Circle(radius);
circle.displayDetails();
	}

}
