package practice.ex03;

public class CarTest {

public static void main(String[] args) {
	
	
	
	// 클래스Car 타입의 주소값을 저장해주는 클래스 Car타입의 n1크기의 배열을 선언해준다
	// exam02 의 EnhancedFor 예제에서 나온 Box 클래스를 사용한것을 참고함
	int n1= 32;
	Car[] b1 = new Car[n1]; 
	for (int i=0; i<n1; i++) {
		b1[i] = new Car("검정색"); // 각 배열에 new를해줘서 생성자를 n1번 호출함
	}							 // -> 자동차는 n1번 검정색은 n1번 만들어짐
		
	int n2= 22;
	Car[] r1 = new Car[n1];
	for (int i=0; i<n2; i++) {
		r1[i] = new Car("빨간색");// -> 같은방식으로 자동차는 n2번
	}							//    빨간색은 n2번 호출됨
	
	Car c1 = new Car("검정색"); // 검정색 한번 더 호출
	
	c1.printAllCarNum();
	c1.printAllRedCarNum();
	
}
	
}
