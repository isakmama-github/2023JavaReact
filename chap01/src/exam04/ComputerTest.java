package exam04;

public class ComputerTest {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {10, 20, 30};
		int result1 = myCom.sum1(values1);
		System.out.println(result1);
		
		
		int result2 = myCom.sum1(new int[] {100, 150, 200});
		System.out.println(result2);
		
		System.out.println(myCom.sum2(1, 2, 3)); 
		
		int result3 = myCom.sum2(100, 150, 200, 250, 300);
		System.out.println(result3);

	}

}
