package exam10;

public class CatchByExceptionKindTest {

	public static void main(String[] args) {
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int num1 = Integer.parseInt(data1);
			int num2 = Integer.parseInt(data2);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("매개 값을 두개 넣어주세요.");
		} catch (Exception e) {
			System.out.println("비정상 수행입니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}

	}

}
