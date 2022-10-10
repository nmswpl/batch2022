package in.co.nmsworks.excercise2;

import java.util.Arrays;

public class ReverseArray
{
    public static void main(String[] args) {
        char[] array = {'a','b','c'};
        char temp = 0;

        for( int i = 0; i < array.length; i++)
        {
            for( int j = 0; j < array.length; j++)
            {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;

            }
        }
        System.out.println("The Reverse of the array is : "+ Arrays.toString(array)+" ");

    }
}
