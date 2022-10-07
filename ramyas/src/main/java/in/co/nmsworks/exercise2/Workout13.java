package in.co.nmsworks.exercise2;
//Given an array of integers, Write a Program to find the sum of the elements of the
//array.
//For E.g Input : arr[] = {1, 2, 3} Output : 6 Reason : 1 + 2 + 3 = 6

public class Workout13
{
    public static void main(String[] args)
    {
      int[] arr = {8,0,2};
      int sum = 0;
        for (int i = 0; i < arr.length ; i++)
        {
           sum+=arr[i];
        }
        System.out.println("SUM OF ARRAY = " +sum);

    }
}
