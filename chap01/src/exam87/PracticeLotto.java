package exam87;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PracticeLotto {

	public static void main(String[] args) {
//		System.out.println("0 ~ 15 사이의 랜덤 숫자 : " + (int)(Math.random() * 15));
		
		String[] students = {"김궁서", "구상모", "이동규", "노태종","김영란","이한재",
				"김유진","이희태","김진","안광현","정영재","박상현", "박기웅","임대훈"};
		if (args.length != 1) {
			System.out.println("문제의 갯수를 args로 넣어주세요.");
			return;
		}
		
        Random random = new Random();
        
        String[] presenter = new String[Integer.parseInt(args[0])];
        
        int randomIndex = random.nextInt(students.length);
        
        for (int i = 0; i < presenter.length; i++) {
            while(isContains(presenter, students[randomIndex])) {
            	randomIndex = random.nextInt(students.length);
            }
            presenter[i] = students[randomIndex];
        }

        System.out.println("발표자는.......... ");
        int number = 0;
        for (String person : presenter) {
        	number++;
            System.out.println(number + "번 문제 => " + person);
        }
	}
	
	static boolean isContains(String[] strArray, String name) {
		List<String> strList = new ArrayList<>(Arrays.asList(strArray));
		return strList.contains(name);

	}

}
