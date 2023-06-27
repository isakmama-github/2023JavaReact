package practice.ex04;

//04. 메서드는 자식 클래스가 오버 라이딩할 수 있지만, 필드는 자식 클래스가 오버 라이딩할 수 없다. 
//    다음 표를 참고해 Parent와 Parent의 자식인 Child를 클래스로 작성하고, 
//    이를 아래에 있는 OvershadowTest 프로그램으로 테스트하시오.
//
//Parent           |        Child
//------------------------------+---------------------------
//필드   String name = "영조"   |  String name = "사도세자"
//메서드     void print()       |  void print()


public class Parent {

	public String name = "영조";
	
	public void print() {
		System.out.println("Parent name : " + name);
	}
}
