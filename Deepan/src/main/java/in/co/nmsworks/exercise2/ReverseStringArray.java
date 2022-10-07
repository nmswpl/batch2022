package exercise2;

import java.util.Arrays;

public class ReverseStringArray {

    public static void main(String[] args) {

        String[] arr = {"B","I","D","J"};
        String[] reversedArray = new String[arr.length];

        for (int i=arr.length-1,j=0 ; i >=0  ; i--)
        {
            reversedArray[j] = arr[i];
            j++;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reversedArray));
    }
}
