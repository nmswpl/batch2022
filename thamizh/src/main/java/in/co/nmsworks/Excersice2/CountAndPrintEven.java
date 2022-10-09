package in.co.nmsworks.Excersice2;

import java.util.ArrayList;
import java.util.List;

public class CountAndPrintEven {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6,7,8,9,11,12,13,14,16,20,30};

        int count=0;

        List<Integer> even=new ArrayList<>();

        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                count++;

                even.add(arr[i]);

            }
        }
        System.out.println("even elements ="+count);

        System.out.println("Reason "+even+"are event elements");
    }




}
