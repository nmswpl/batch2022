package in.co.nmsworks.exercise2;
//Given an array of integers, Write a Program to print number of odd elements.
//For E.g Input : arr[] = {32, 43, 4, 15} Output : Odd elements = 2 Reason : 43 & 15
//are odd.
public class Workout12
{
    public static void main(String[] args)
    {
        int[] arr = {32,43,4,15,67,91};
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
           if(arr[i] %2 != 0)
           {
               count ++;
           }
        }
        System.out.println("NO OF ODD ELEMENTS ARE : " +count);
    }
}
