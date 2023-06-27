package exam02;

public class ArrayCreateByValueList {

	public static void main(String[] args) {
		int[] scores = {90, 80, 70};
		int sum = add(scores);
		System.out.println(sum);
		
        sum = add(new int[] {80, 90, 100});
        System.out.println(sum);
	}
	
	public static int add(int[] scores) {
		
		int sum = 0;
//		for(int i=0; i<scores.length; i++) {
//			sum += scores[i];
//		}
		
//		향상된 for문 
		for(int score:scores) {
			sum += score;
		}
		return sum;
		
	}

}
