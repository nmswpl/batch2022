package in.co.nmsworks.excercise2;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr1 = {12, 3, 20, 14};
        System.out.println("\nArray1: " + Arrays.toString(arr1));
            if(arr1[0]>arr1[1]&&arr1[0]>arr1[2]&&arr1[0]>arr1[3])
            {
                System.out.println(arr1[0]);
            } else if (arr1[1]>arr1[0]&&arr1[1]>arr1[2]&&arr1[1]>arr1[3]){
                System.out.println(arr1[1]);
            }
            else if (arr1[2]>arr1[0]&&arr1[2]>arr1[1]&&arr1[2]>arr1[3]) {
                System.out.println(arr1[2]);
            }
            else
            {
                System.out.println(arr1[3]);
            }
    }
}
