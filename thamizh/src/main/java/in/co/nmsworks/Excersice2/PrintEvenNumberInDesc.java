package in.co.nmsworks.Excersice2;

import java.util.ArrayList;
import java.util.List;

public class PrintEvenNumberInDesc {

    public static void main(String[] args) {

        List<Integer> evennumber=new ArrayList<>();

        List<Integer> even=new ArrayList<>();


        for(int i=700;i>=600;i--)
        {
            if(i%2==0)
            {
                evennumber.add(i);
            }

        }

        System.out.println(evennumber);

    }
}
