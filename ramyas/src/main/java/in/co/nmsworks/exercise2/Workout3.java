package in.co.nmsworks.exercise2;

import java.util.Arrays;

//o multiply two arrays of same size element-by-element.
//E.g : Input : arr1 = {2,4,1} arr2={3,5,7} Output : 6 20 7
public class Workout3
{
    public static void main(String[] args)
    {
      int[] arr1 = {2,4,1};
      int[] arr2 = {3,5,7};
      int[]  sumarr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++)
        {
            sumarr[i]= arr1[i] * arr2[i];
        }

        System.out.println(Arrays.toString(sumarr));

    }


}
