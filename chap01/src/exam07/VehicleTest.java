package exam07;

public class VehicleTest {

	public static void main(String[] args) {
//		Vehicle vehicle = new Vehicle();
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare();
		
		// 강제 형변환
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();

	}

}
