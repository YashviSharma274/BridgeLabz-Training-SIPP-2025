package oopsconcept;

public class MobilPhone {
private String brand;
private String model;
private double price;
MobilPhone(String brand,String model,double price){
	this.brand=brand;
	this.model=model;
	this.price=price;
}
public void displayDetails() {
	System.out.println("Brand of mobile phone: "+brand);
	System.out.println("Model of mobile phone: "+model);
	System.out.println("Price of mobile phone: "+price);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MobilPhone mobilephone=new MobilPhone("Samsung","M6 Pro",20000.0);
mobilephone.displayDetails();
	}

}
