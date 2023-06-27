package exam15;

import java.util.Optional;

public class OptionaNullTest {

	public static void main(String[] args) {
//		String s1 = "안녕!";
//		String s1 = "";
		String s1 = null;
		Optional<String> o = Optional.ofNullable(s1);
		
		if(s1 != null) {
			Util.print(s1);
		} else {
			Util.print("없음");
		}
		System.out.println();
		
		if(o.isPresent()) {
			Util.print(o.get());
		} else {
			Util.print("없음");
		}
		System.out.println();
		
		String s2 = o.orElse("없음");
		Util.print(s2);
		System.out.println();
		
		o.ifPresentOrElse(Util::print, 
				()->System.out.println("없음"));

	}

}
