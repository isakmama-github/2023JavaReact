package exam02;

public class EnumEx2 {

	public static void main(String[] args) {
		Gender gender = Gender.FEMALE;
		
		if(gender == Gender.MALE) { 
			System.out.println(Gender.MALE + "은 병역의 의무가 있어요.");
		}else { 
			System.out.println(Gender.FEMALE + "은 병역의 의무가 없어요.");
		}
		
		for(Gender g : Gender.values()) {
			System.out.println(g.name());
		}
		
		System.out.println(Gender.valueOf("MALE"));
		System.out.println(Gender.valueOf("FEMALE"));
	}

}
