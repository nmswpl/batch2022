package in.co.nmsworks.excercise2;

import java.util.Arrays;
//multiply two arrays
public class MultiplyTwoArrays
{
    public static void main(String[] args)
    {
        int[] arr1 = {2,4,1};
        int[] arr2 = {3,5,7};
        int[] result = new int[3];
        int i;

      for ( i = 0; i < arr1.length; i++)
      {

                result[i] = arr1[i] * arr2[i];

      }
        System.out.print("output = " + Arrays.toString(result));

    }

}

