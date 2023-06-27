package interfaceEx.jyj;

public interface Electronics {
    void switchOn();

    void switchOff();

    default void repair(){
        System.out.println("장비를 수리한다.");
    };

    void factoryreset();
}
