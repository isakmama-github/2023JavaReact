package exam87;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Random_mem {

	public List<String> spilt_user(String[] arr, int n) {
		Random in = new Random();
		List<String> user = new ArrayList<>();
		for (int i = 0; i < n;) {
			int key = in.nextInt(5);
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
			int key = in.nextInt(5);
			if (!arr[key].equals("")) {
				user.add(arr[key]);
				arr[key] = "";
				i++;
			}
		}

		return user;

	}

	public static void main(String[] args) {

		String[] nameStringA = {"김궁서", "이희태", "박기웅", "안광현", "김재훈"};
		String[] nameStringB = {"박상현", "임대훈", "김영란", "노태종", "김자바"};
		String[] nameStringC = {"정영재", "김유진", "김 진", "구상모", "이한재"};

		Random_mem random_member = new Random_mem();

		String[][] mem = new String[3][5];

		List<String> user = random_member.spilt_user(nameStringA, 5);
		String[] arr = user.toArray(String[]::new);

		for (int i = 0; i < 5; i++) {
			mem[i][0] = arr[i];
		}

		user = random_member.spilt_user(nameStringB, 5);
		arr = user.toArray(String[]::new);

		for (int i = 0; i < 5; i++) {
			mem[i][1] = arr[i];
		}
		user = random_member.spilt_user(nameStringC, 5);
		arr = user.toArray(String[]::new);

		for (int i = 0; i < 5; i++) {
			mem[i][2] = arr[i];
		}
//		user = random_member.spilt_user(nameStringD, 4);
//		arr = user.toArray(String[]::new);
//
//		for (int i = 0; i < 4; i++) {
//			mem[i][3] = arr[i];
//		}
//		user = random_member.spilt_user2(nameStringE, 5);
//		arr = user.toArray(String[]::new);
//
//		for (int i = 0; i < 4; i++) {
//			mem[i][4] = arr[i];
//		}

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "조 : ");
			for (int j = 0; j < 6; j++) {
				if (j < 5)
					System.out.print(mem[i][j] + ", ");
				else
					System.out.print(mem[i][j]);
			}
			System.out.println(" ");
		}

//		Random in = new Random();
//		int sp = in.nextInt(4) + 1;
//		System.out.println("조추첨 : " + sp + "조, " + arr[4]);

		// String[] nameString = {"곽호성","김나영","김동완","김성진","김세훈","김용운","문수찬","박주현",
		// "서경원","성다영","안병준","오세원","유승민","장은비","장현수","정효영","조규범","조상용","차승현","최석호","한승현"};

	}
}
