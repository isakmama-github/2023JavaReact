package practice.ex06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		// 학생의 성적을 담은 객체 생성
		List<Integer> studentsGrade = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		// 학생의 점수를 입력받음, 점수가 음수라면 실행을 종료.
		// 예외처리로 while문과 boolean 타입의 isErro 변수, try-catch문을 사용
		boolean isError = true;
		while(isError) {
			try {
				while (true) {
					System.out.print("점수를 입력하세요 :");
					int input = Integer.parseInt(sc.nextLine());
					if (!(input < 0)) {
						studentsGrade.add(input);
					} else {
						isError = false;
						break;
					}
				}
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
			}
		}
		
		
		// 입력 받은 점수의 최대값을 구함.
		int MaxGrade = Collections.max(studentsGrade);
//		for (Integer grade : studentsGrade) {
//			System.out.print(grade + " ");
//			if (grade > MaxGrade) {
//				MaxGrade = grade;
//			}
//		}
		//주어진 조건에 따라서 등급을 받음.
		//A : 점수가 최대값의 -10 이상인 경우
		//B : 점수가 최대값의 -20 이상 -10 미만인 경우
		//C : 점수가 최대값의 -20 미만
		
		System.out.print("학생들의 성적 : ");
		System.out.println();
		String gradeRank = null;
		
		int i = 1;
		for (Integer student : studentsGrade) {
			gradeRank = (student >= MaxGrade - 10 ? "A" : student >= MaxGrade - 20 && student < MaxGrade -10 ? "B" : "C" );
			System.out.println(i + "번 학생의 성적은" + student + "이며" + gradeRank + "등급 입니다.");
			++i;
		}
		
//		for (int i = 0; i < studentsGrade.size(); i++) {
//			if (studentsGrade.get(i) >= MaxGrade - 10) {
//				gradeRank = "A";
//			} else if (studentsGrade.get(i) >= MaxGrade - 20 && studentsGrade.get(i) < MaxGrade - 10) {
//				gradeRank = "B";
//			} else {
//				gradeRank = "C";
//			}
//			System.out.println(i + 1 + "번 학생의 성적은 " + studentsGrade.get(i) + "이며 " + gradeRank + "등급 입니다.");
			sc.close();
		}
	
}
