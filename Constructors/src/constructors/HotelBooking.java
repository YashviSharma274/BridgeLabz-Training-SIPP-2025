package constructors;

public class HotelBooking {
private  String guestName;
private String roomType;
private int rentalDays;
HotelBooking(){
	guestName="guest";
	roomType="seater";
	rentalDays=0;
}
HotelBooking(String guestName,String roomType,int rentalDays){
	this.guestName=guestName;
	this.roomType=roomType;
	this.rentalDays=rentalDays;
}
public void displayDetails() {
	System.out.println("Guestname: "+guestName);
	System.out.println("Seater: "+roomType);
	System.out.println("rentalDays: "+rentalDays);
}
HotelBooking(HotelBooking booking){
	this.guestName=booking.guestName;
	this.roomType=booking.roomType;
	this.rentalDays=booking.rentalDays;
}
	public static void main(String[] args) {
		HotelBooking hotel=new HotelBooking("Yashvi","Two Seater",2);
		hotel.displayDetails();
		HotelBooking hotel2=new HotelBooking(hotel);
		System.out.println("Copy Verison");
		hotel2.displayDetails();
		// TODO Auto-generated method stub

	}

}
