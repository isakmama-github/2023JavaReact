package interfaceEx.jyj;

public class Tv implements Electronics{

    @Override
    public void switchOn() {
        System.out.println("티비를 킵니다.");
    }

    @Override
    public void switchOff() {
        System.out.println("티비를 끕니다.");
    }

    @Override
    public void factoryreset() {
        System.out.println("티비 공장초기화");
    }
}
