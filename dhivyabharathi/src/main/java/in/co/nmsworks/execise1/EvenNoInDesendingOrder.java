package in.co.nmsworks.execise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EvenNoInDesendingOrder {
    public static void main(String[] args) {
        List<Integer> EvenNo = new ArrayList<>();
        for(int i =601 ; i<=700; i++)
        {
            if(i%2 == 0)
            {
                EvenNo.add(i);
            }
        }
        System.out.println("Asending Order");
        System.out.println(EvenNo);

        Collections.reverse(EvenNo);
        System.out.println("Desending Order");
        System.out.println(EvenNo);
    }

}
