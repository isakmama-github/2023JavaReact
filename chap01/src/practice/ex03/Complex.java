//복소수를 모델링한 Complex 클래스를 작성하고, ComplexTest 클래스를 작성해 테스트하시오. 메소드 오버로딩 사용.
//== 조건 : Complex 클래스에는 허수부와 실수부가 있다. print()메소드는 필드를 다음과 같이 출력한다.
//== 출력 : 1.0 + 0.0i  
//         1.5 + 2.5i

package practice.ex03;

public class Complex {
	double x;
	double y;
	
	Complex(){
	}
	
	void print(double x, double y) {
		x = (Math.round(x * 10) ) / (double)10;
		y = (Math.round(y * 10) ) / (double)10;		
		System.out.println(x+" + "+ y+"i");
	}
	void print(double x) {
		x = (Math.round(x * 10) ) / (double)10;
		System.out.println(x+" + "+ "0.0i");
	}
}

