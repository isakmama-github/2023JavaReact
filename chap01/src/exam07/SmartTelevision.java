package exam07;

public class SmartTelevision implements RemoteControl, Searchable{

	private int volumn;
	
	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("SmartTV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("SmartTV를 끕니다.");
		
	}

	@Override
	public void setVolumn(int volumn) {
		if(volumn>RemoteControl.MAX_VOLUMN) {
			this.volumn = RemoteControl.MAX_VOLUMN;
		}else if(volumn < RemoteControl.MIN_VOLUMN) {
			this.volumn=RemoteControl.MIN_VOLUMN;
		} else {
			this.volumn = volumn;
		}
		System.out.println("현재 SmatTv볼륨: "+this.volumn);
		
	}

}
