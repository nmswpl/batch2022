package in.co.nmsworks.excercise1;

import java.util.Arrays;

public class OddNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int odd=0;
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                System.out.println(arr[i]);
                odd=odd+1;
            }
            //System.out.println(odd);
        }
       System.out.println("no of odd elements " +odd);
    }
}
