package in.co.nmsworks.exercise2;

//even numbers between 601 to 700 in desc

import java.util.*;

public class EvenNumbers {

    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();


        for (int i=601;i<=700;i++ )
            if (i % 2 == 0) {
                list.add(i);
            }
        Collections.reverse(list);
        System.out.println(list);
    }
}
