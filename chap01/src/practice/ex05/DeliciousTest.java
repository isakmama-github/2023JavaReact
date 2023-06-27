package practice.ex05;

public class DeliciousTest{

	public static void main(String[] args) {
		Delicious tendong = new Delicious() {
			
			@Override
			public void eat() {
				System.out.println("텐동을 먹는다");
			}

			@Override
			public void sweet() {
				System.out.println("텐동은 달다");
			}

			@Override
			public void happy() {
				System.out.println("텐동을 먹으면 행복해");
			}
		};
		
		tendong.eat();
		tendong.sweet();
		tendong.happy();
	}

}
