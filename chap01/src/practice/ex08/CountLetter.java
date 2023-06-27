package practice.ex08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountLetter {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String fpath;
		String taget;

		System.out.print("파일을 입력하세요 : ");
		fpath = in.nextLine();

		System.out.print("세고자하는 문자를 입력하세요 : ");
		taget = in.nextLine();
		List<String> tmp = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(fpath))) {
			while (true) {
				String brstr = br.readLine();
				if (brstr == null)
					break;
				tmp.add(brstr);
			}
		} catch (Exception e) {
			System.out.println("파일이 없습니다");
		}
		
//		int result = tmp.stream().mapToInt(p->{
//			int count=0;
//			for(int k=0; k<p.length(); k++) {
//				if(p.charAt(k)==taget.charAt(0))
//					count++;
//			}
//			return count;
//		}).sum(); //.peek(p->System.out.print(p + " / "))     .peek(p->System.out.println(p))
		
//		int result = tmp.stream().filter(p->p.contains(taget)).mapToInt(p->p.length()-p.replaceAll(taget, "").length()).sum();
		
		long result = tmp.stream().mapToLong(p->p.chars().filter(c->c==taget.charAt(0)).count()).sum();
		
		System.out.println(fpath + " 파일에 " + taget + "문자가 " + result + "개 있습니다.");

	}
}
