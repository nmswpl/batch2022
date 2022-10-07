package in.co.nmsworks.excercise2;

import java.util.Arrays;

public class OddElements {
    public static void main(String[] args) {
        int count=0;
         int arr1[] = {32, 43, 4, 15};
        System.out.println("\nArray: " + Arrays.toString(arr1));
        for (int num1 : arr1) {
            if (num1 % 2 != 0) {
                count = count + 1;
                System.out.println(num1);
            }

        }
        System.out.println("odd elements :"+count);
    }
}
