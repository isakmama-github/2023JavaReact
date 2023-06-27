package exam02;

public class EnumEx {

	public static void main(String[] args) {
		Gender gender = Gender.FEMALE;
		if(gender == Gender.MALE) {
			System.out.println(Gender.MALE + "는 병역의 의무가 있어요.");
		} else {
			System.out.println(Gender.FEMALE + "는 병역의 의무가 없어요.");
			
		}
		
		Direction direction = Direction.SOUTH;
		if(direction == Direction.SOUTH) {
			System.out.println(Direction.SOUTH );
		}

	}
	
	enum Gender { MALE, FEMALE}
	enum Direction{EAST, WEST, SOUTH, NORTH}

}
