package exam14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CarComperator2Test {

	public static void main(String[] args) {
		List<Car> list = Car.cars.subList(0, 3);
		Car[] cars = list.toArray(new Car[4]);
		
		Comparator<Car> modelComparator = 
				Comparator.comparing(Car::getModel);
		System.out.println(Arrays.toString(cars));
		
		Comparator<Car> modelComparatorNullFirst = 
				Comparator.nullsFirst(modelComparator);
		Arrays.sort(cars, modelComparatorNullFirst);
		System.out.println(Arrays.toString(cars));

		list.set(2, new Car("코란도", false, 10, 220000));
		System.out.println(list);
		cars = list.toArray(new Car[3]);
		System.out.println(Arrays.toString(cars));
		
		Comparator<Car> ageComperator =
				modelComparator.thenComparing(Car::getAge);
		Arrays.sort(cars, ageComperator);
		System.out.println(Arrays.toString(cars));
		
	}

}
