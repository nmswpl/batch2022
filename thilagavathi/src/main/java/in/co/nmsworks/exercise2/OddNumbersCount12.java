//a program for to print the count of odd numbers in the array(12)
//input:arr={32,43,4,15}

package in.co.nmsworks.exercise2;
import java.util.Arrays;
public class OddNumbersCount12 {
    public static void main(String[] args) {
        int[] arr = {32, 43, 4, 15};
        int count = 0;
        System.out.println("Original Array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
            System.out.printf("Number of odd elements in the array:"+ count);
        }
    }


















