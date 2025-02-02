import java.util.Scanner;
public class HotelBookingOops{
	private String guestName;
	private String roomType;
	private int nights;
	public HotelBookingOops(){
	this.guestName = "Shiva";
	this.roomType = "Luxury";
	this.nights = 2;
	}
	public HotelBookingOops(String guestName,String roomType,int nights){
	this.guestName = guestName;
	this.roomType = roomType;
	this.nights = nights;
	}
	public HotelBookingOops(HotelBookingOops s){
	this.guestName = s.guestName;
	this.roomType = s.roomType;
	this.nights = s.nights;
	}
	public void displayDetails(){
	System.out.println("Name of guest is "+guestName+" and type of room staying is "+roomType+" for "+nights+" nights");
	}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter guest name");
	String guestName = sc.nextLine();
	System.out.println("Enter room type");
	String roomType = sc.nextLine();
	System.out.println("Enter number of nights to stay");
	int nights = sc.nextInt();
	HotelBookingOops obj1 = new HotelBookingOops();
	HotelBookingOops obj2 = new HotelBookingOops(guestName,roomType,nights);
	HotelBookingOops obj3 = new HotelBookingOops(obj2);
	obj1.displayDetails();
	obj3.displayDetails();
	obj2.displayDetails();
	}
}

