package exam14;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CarComperator1Test {

	public static void main(String[] args) {
		List<Car> list = Car.cars.subList(0,3);
		Car[] cars = list.toArray(new Car[3]);
		
		Comparator<Car> modelComperator =
				Comparator.comparing(Car::getModel);
		
		System.out.println(Arrays.toString(cars));
		Arrays.sort(cars, modelComperator);
		System.out.println(Arrays.toString(cars));
		
		Arrays.sort(cars, modelComperator.reversed());
		System.out.println(Arrays.toString(cars));
		
		Arrays.sort(cars, Comparator.comparing(Car::getMileage));
		System.out.println(Arrays.toString(cars));
		
//		Arrays.sort(cars, Comparator.comparing(Car::getMileage)
//				.reversed());
		Arrays.sort(cars, Comparator.comparing(Car::getMileage,
				(a, b)-> b-a));
		System.out.println(Arrays.toString(cars));
	}

}
