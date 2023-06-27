package practice.ex06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Consumer;

//interface Grade{
//    void apply(int i);
//}


public class GradeTest {
    //90
    //80
    //79
    //70
    //69
    public static void main(String[] args) {
        int input = 0;

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        do{
            input = sc.nextInt();
            if(input>=0) arr.add(input);
            else break;
        }while(true);

       
        int max = Collections.max(arr);
        
//        for(int i :arr) {
//        	if(max<i) {
//        		max = i;
//        	}
//        }
//        System.out.println(max);

//        for(int n : arr){
//            System.out.print(n + " : ");
//            if(max-n <=10) System.out.println("A");
//            else if(max-n <=20) System.out.println("B");
//            else System.out.println("C");
//        }
        final int lambdaMax = max;
        findGrade(arr, i -> {
            System.out.print(i + " : ");
            if(lambdaMax-i <=10) System.out.println("A");
            else if(lambdaMax-i <=20) System.out.println("B");
            else System.out.println("C");
        });

        Collections.sort(arr);

        for(int n : arr){
            System.out.print("Ef : " + n + " : ");
            if(arr.get(arr.size() - 1)-n <=10) System.out.println("A");
            else if(arr.get(arr.size() - 1)-n <=20) System.out.println("B");
            else System.out.println("C");
        }
    }

    public static void findGrade(ArrayList<Integer> i, Consumer<Integer> g){
        for(int n : i)
            g.accept(n);
    }
}
