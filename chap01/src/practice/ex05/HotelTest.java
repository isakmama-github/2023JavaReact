package practice.ex05;

public class HotelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hotel hotel = new Hotel();
	        hotel.add(5,"호돌이");
	        hotel.add(7,"길동이");
	        hotel.show();
	        
	        System.out.println();
	        
	        hotel.add(5,"방랑자");
	        hotel.add(1,"방랑자");
	        hotel.add(8,"김자바");
	        hotel.show();
	}
}
