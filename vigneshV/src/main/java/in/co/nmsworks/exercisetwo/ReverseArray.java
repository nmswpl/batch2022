package in.co.nmsworks.exercisetwo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c'};
        int i=0;
        int j = arr.length-1;
        while(i<j)
        {
            char temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
