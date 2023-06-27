package exam02;


/*int형 1차원 배열을 매개변수로 전달받아서 배열에 저장된 
 최댓값, 최솟값을 찾아서 반환하는 메소드를 각각 다음의 형태로 정의하시오.
*/


public class EnhancedFor02 {
	public static void main(String[] args) {
		int[] arr = {90,80,70};
		int num1 = minValue(arr);
		System.out.println("배열의 최소값은 " + num1);
		
		int num2 = maxValue(arr);
		System.out.println("배열의 최대값은 " + num2);

		
	}
	
			//▼ 배열을 하나씩 꺼내서 최솟값을 구한다.
	public static int minValue(int[] arr) {
		int min=0;
		min = arr[0];
		for(int i=1;i<arr.length; i++) {
//		for(int score:arr) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
			//▼ 배열을 하나씩 꺼내서 최댓값을 구한다.
	public static int maxValue(int[] arr) {
		int max=0;
		max = arr[0];
//		for(int j=1;j<arr.length; j++) {
		for(int score:arr) {
			if(max<score) {
				max = score;
			}
		}
		return max;
	}
}
