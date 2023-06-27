package interfaceEx.jyj;

public class Computer implements Electronics{

    @Override
    public void switchOn() {
        System.out.println("컴퓨터를 킵니다.");
    }

    @Override
    public void switchOff() {
        System.out.println("컴퓨터를 끕니다.");
    }


    @Override
    public void factoryreset() {
        System.out.println("컴퓨터 공장초기화.");
    }
}
