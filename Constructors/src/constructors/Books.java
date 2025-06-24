package constructors;

public class Books {
	private String title;
	private String author;
	private double price;
	private String availability;
	
		// TODO Auto-generated method stub
		Books(String title,String author,double price,String availability){
			this.title=title;
			this.author=author;
			this.price=price;
			this.availability=availability;
	}
		void displayDetails(){
			System.out.println("Title: "+title);
			System.out.println("Author Name: "+author);
			System.out.println("Price: "+price);
			System.out.println("Availibity: "+availability);

}
		public static void main(String[] args) {
			Books book=new Books("Malgudi Days","JK Rowling",200.0,"Yes");
			book.displayDetails();
		}
		}
