package in.co.nmsworks.excercise2;

import java.util.Arrays;


public class EvenElements {
        public static void main(String[] args) {
            int count=0;
            int[] arr1 = {2, 3, 4, 5, 6};
            System.out.println("\nArray: " + Arrays.toString(arr1));
            for (int num1 : arr1) {
                if (num1 % 2 == 0) {
                    count = count + 1;
                    System.out.println(num1);
                }

            }
            System.out.println("even elements :"+count);
        }


}
