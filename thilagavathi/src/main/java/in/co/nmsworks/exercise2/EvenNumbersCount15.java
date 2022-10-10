//program for count of the even numbers(15)
//input:arr={2,3,4,5,6}


package in.co.nmsworks.exercise2;

import java.util.Arrays;

public class EvenNumbersCount15 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        int count = 0;
        System.out.println("Original Array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.printf("Number of odd elements in the array:" +count);
    }
}


