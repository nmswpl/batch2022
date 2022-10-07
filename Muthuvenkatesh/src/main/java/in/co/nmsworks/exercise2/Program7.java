// 7.Write a program to print the square of every element present in the array.
package in.co.nmsworks.exercise2;

import java.util.Arrays;

public class Program7 {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 3, 5};
        for(int i=0;i< arr1.length;i++){
            arr1[i] = arr1[i]*arr1[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
