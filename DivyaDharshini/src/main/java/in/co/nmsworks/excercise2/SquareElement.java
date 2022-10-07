package in.co.nmsworks.excercise2;

import java.util.Arrays;

public class SquareElement {
    public static void main(String[] args) {
        String result = "";
        int[] arr1 = {2, 4, 3, 5};
        System.out.println("\nArray1: " + Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            int num1 = arr1[i];
            result += (Integer.toString(num1 * num1) + " ");
        }
        System.out.println("\n" + result);
    }
}
