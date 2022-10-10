package in.co.nmsworks.excercise2;

import java.util.Arrays;

public class SquareOfElementInArray
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] square = new int[4];

        for( int i = 0; i < arr.length; i++)
        {
            square[i] = arr[i] * arr[i];
        }
        System.out.println(Arrays.toString(square));
    }
}
