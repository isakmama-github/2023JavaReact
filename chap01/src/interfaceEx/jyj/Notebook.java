package interfaceEx.jyj;

public class Notebook implements Electronics{


    @Override
    public void switchOn() {
        System.out.println("노트북을 킵니다.");
    }

    @Override
    public void switchOff() {
        System.out.println("노트북을 끕니다.");
    }


    @Override
    public void factoryreset() {
        System.out.println("노트북 공장초기화.");
    }
}
