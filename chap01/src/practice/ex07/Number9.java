package practice.ex07;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Number9 {
    public static void main(String[] args) {
        int num = 30;
        IntStream is = IntStream.range(1, num);
        is.mapToObj(i -> {
            String str = "";
            for(int j=i; j<num; j++){
                for(int k=j; k<num; k++){
                    if(k == Math.sqrt(i*i + j*j)){
                        str += String.valueOf(i) + ",";
                        str += String.valueOf(j) + ",";
                        str += String.valueOf(k);
                        str += ".";
                    }
                }
            }
            return str;
        }).flatMap(s -> Arrays.stream(s.split("\\.")))
                .filter(s -> !s.isEmpty())
                .forEach(x -> System.out.print("(" + x + ")"));
    }
}
