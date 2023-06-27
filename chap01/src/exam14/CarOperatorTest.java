package exam14;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class CarOperatorTest {

	public static void main(String[] args) {
		Comparator<Integer> comperator = (a, b) -> a - b;
		
		BinaryOperator<Integer> bo1 = BinaryOperator.maxBy(comperator);
		System.out.println(bo1.apply(10, 5));
		System.out.println(bo1.apply(10, 25));
		
		BinaryOperator<Integer> bo2 = BinaryOperator.minBy(comperator);
		System.out.println(bo2.apply(10, 5));
		System.out.println(bo2.apply(10, 25));
		
		List<Car> newCars = remodeling(Car.cars, 
				c-> new Car("뉴"+c.getModel(),c.isGasoline(),c.getAge(), c.getMileage()));
		System.out.println(newCars);

	}
	
	static List<Car> remodeling(List<Car> cars, UnaryOperator<Car> o){
		ArrayList<Car> result = new ArrayList<Car>();
		for(Car car: cars) {
			result.add(o.apply(car));
		}
		return result;
	}

}
