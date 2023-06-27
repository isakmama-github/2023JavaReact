package exam06;

public class DmbCellPhoneTest {

	public static void main(String[] args) {
		DmbCellPhone dmbcell = new DmbCellPhone();
		
		DmbCellPhone dmbCellPhone = 
				new DmbCellPhone("자바폰", "흰색", 10);
		System.out.println("모델 : "+ dmbCellPhone.model);
		System.out.println("색상 : "+ dmbCellPhone.color);
		
		System.out.println("채널 : "+ dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("안녕하세요..");
		dmbCellPhone.receiveVoice("네네네...");
		dmbCellPhone.sendVoice("반가워유~");
		dmbCellPhone.hangup();
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChennelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
