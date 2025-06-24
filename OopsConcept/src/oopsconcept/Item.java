package oopsconcept;

public class Item {
private int itemCode;
private String itemName;
private double price;
Item(int itemCode,String itemName,double price){
	this.itemCode=itemCode;
	this.itemName=itemName;
	this.price=price;
}
public double totalcost(int quantity) {
	return price*quantity;
}
public void displayDetails() {
    System.out.println("Item Code: " + itemCode);
    System.out.println("Item Name: " + itemName);
    System.out.println("Price per unit: ₹" + price);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Item item = new Item(1001, "Wireless Mouse", 599.99);
		  item.displayDetails();
		  int quantity = 3;
		  double totalCost = item.totalcost(quantity);
		  System.out.println("Quantity: " + quantity);
	        System.out.println("Total Cost: ₹" + totalCost);
	}

}
