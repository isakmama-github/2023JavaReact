package exam11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		
		// Date클래스에는 toString()이 오버라이딩 되어있다.
		String strNow = now.toString();
		System.out.println(strNow);	
		System.out.println(now);
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
		
		System.out.println(sdf.format(now));

	}

}
