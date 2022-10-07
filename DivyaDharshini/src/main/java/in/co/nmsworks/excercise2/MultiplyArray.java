package in.co.nmsworks.excercise2;
import java.util.*;

public class MultiplyArray {
    public static void main(String[] args) {
        String result = "";
        int[] arr1 = {2, 4, 1};
        int[] arr2 = {3, 5, 7};
        System.out.println("\nArray1: " + Arrays.toString(arr1));
        System.out.println("\nArray2: " + Arrays.toString(arr2));
        for (int i = 0; i < arr1.length; i++) {
            int num1 = arr1[i];
            int num2 = arr2[i];
            result += (Integer.toString(num1 * num2) + " ");
        }
        System.out.println("\n" + result);
    }


}
