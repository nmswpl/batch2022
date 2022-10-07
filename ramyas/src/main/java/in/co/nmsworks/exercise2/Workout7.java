package in.co.nmsworks.exercise2;

import java.util.Arrays;

//Write a program to print the square of every element present in the array.
//E.g : Input : arr1 = {2, 4, 3, 5} Output : 4 16 9 25
public class Workout7
{
    public static void main(String[] args)
    {
        int[] arr = {2,4,3,5};

        for (int i = 0; i < arr.length ; i++)
            arr [i] = (int) Math.pow(arr[i], 2);

        System.out.println(Arrays.toString(arr));
    }
}
