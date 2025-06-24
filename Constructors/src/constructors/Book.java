package constructors;

public class Book {
private String title;
private String author;
private double price;
//Default constructor
Book(){
	title="Title";
	author="Author";
	price=0.0;
}
//Parameterized constructor
Book(String title,String author,double price){
	this.title=title;
	this.author=author;
	this.price=price;
}void displayDetails(){
	System.out.println("Title: "+title);
	System.out.println("Author Name: "+author);
	System.out.println("Price: "+price);
}
	public static void main(String[] args) {
		Book book=new Book("Malgudi Days","JK Rowling",200.0);
		book.displayDetails();
		// TODO Auto-generated method stub

	}

}
