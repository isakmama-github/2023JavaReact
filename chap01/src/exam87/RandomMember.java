package exam87;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomMember {

	public List<String> spilt_user(String[] arr, int n) {
		Random in = new Random();
		List<String> user = new ArrayList<>();
		for (int i = 0; i < n;) {
			int key = in.nextInt(3);
			if (!arr[key].equals("")) {
				user.add(arr[key]);
				arr[key] = "";
				i++;
			}
		}

		return user;

	}

	public List<String> spilt_user2(String[] arr, int n) {
		Random in = new Random();
		List<String> user = new ArrayList<>();
		for (int i = 0; i < n;) {
			int key = in.nextInt(3);
			if (!arr[key].equals("")) {
				user.add(arr[key]);
				arr[key] = "";
				i++;
			}
		}

		return user;

	}

	public static void main(String[] args) {
		
		String[] students = {"김궁서", "구상모", "이동규", "노태종","김영란","이한재",
				"김유진","이희태","김진","안광현","정영재","박상현", "박기웅","임대훈"};

//		String[] nameStringA = { "김궁서", "이희태", "박기웅", "안광현", "김재훈" };
//		String[] nameStringB = { "박상현", "임대훈", "김영란", "노태종", "김자바" };
//		String[] nameStringC = { "정영재", "김유진", "김 진", "구상모", "이한재" };
//		String[] nameStringD = { "김재훈", "구상모", "이한재", "김자바" };
		
		String[] nameStringA = { "김궁서", "이희태", "박기웅" };
		String[] nameStringB = { "박상현", "임대훈", "김영란" };
		String[] nameStringC = { "정영재", "김유진", "김 진" };
		String[] nameStringD = { "김재훈", "안광현", "이한재" };
		String[] nameStringE = { "구상모", "노태종", "강자바" };

		RandomMember randomMember = new RandomMember();

		String[][] mem = new String[3][5];

		List<String> user = randomMember.spilt_user(nameStringA, nameStringA.length);
//		System.out.println(user);
		
		String[] arr = user.toArray(String[]::new);

		for (int i = 0; i < nameStringA.length; i++) {
			mem[i][0] = arr[i];
		}

		user = randomMember.spilt_user(nameStringB, nameStringB.length);
		arr = user.toArray(String[]::new);

		for (int i = 0; i < nameStringB.length; i++) {
			mem[i][1] = arr[i];
		}
		user = randomMember.spilt_user(nameStringC, nameStringC.length);
		arr = user.toArray(String[]::new);

		for (int i = 0; i < nameStringC.length; i++) {
			mem[i][2] = arr[i];
		}
		user = randomMember.spilt_user(nameStringD, nameStringD.length);
		arr = user.toArray(String[]::new);

		for (int i = 0; i < nameStringD.length; i++) {
			mem[i][3] = arr[i];
		}
		user = randomMember.spilt_user(nameStringE, nameStringE.length);
		arr = user.toArray(String[]::new);

		for (int i = 0; i < nameStringE.length; i++) {
			mem[i][4] = arr[i];
		}

		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + "조 : ");
			for (int j = 0; j < 5; j++) {
//				if (j < mem[i].length)
//					System.out.print(mem[i][j] + ", ");
//				else
					System.out.print(mem[i][j] + ", ");
			}
			System.out.println(" ");
		}

//		Random in = new Random();
//		int sp = in.nextInt(4) + 1;
//		System.out.println("조추첨 : " + sp + "조, ");

		// String[] nameString = {"곽호성","김나영","김동완","김성진","김세훈","김용운","문수찬","박주현",
		// "서경원","성다영","안병준","오세원","유승민","장은비","장현수","정효영","조규범","조상용","차승현","최석호","한승현"};

	}
}
