package practice.ex06;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Grade {
    public static void findGrade(ArrayList<Integer> i, Consumer<Integer> g){
        for(int n : i)
            g.accept(n);
    }
}
