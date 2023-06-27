package practice.ex08;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Number8_6 {
    public static void main(String[] args) throws Exception{
        String[] animals = {"ant", "bat", "cat", "dog"};
        FileOutputStream fos = new FileOutputStream("C:/Temp/animals.txt");
        PrintStream ps = new PrintStream(fos);

        for(String str : animals){
            char c = str.charAt(0);
            ps.println(c + " : " + str);
        }
    }
}
