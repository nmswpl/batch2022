package in.co.nmsworks.excercise2;

import java.util.ArrayList;
import java.util.List;

public class ArrayOddElements {
    public static void main(String[] args) {
        int[] arr1={32,43,4,15};
        List<Integer> number=new ArrayList<>();
        int count=0;
        for (int i=0; i< arr1.length; i++)
        {
            if(arr1[i]%2!=0)
            {
                count++;
                number.add(arr1[i]);
            }
        }
        System.out.print("Odd Elements = "+count+" Reasons : "+number+ " are odd");
    }
}
