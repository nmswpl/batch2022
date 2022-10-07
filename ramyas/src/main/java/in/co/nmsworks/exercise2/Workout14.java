package in.co.nmsworks.exercise2;
//14. Given an array of String, Write a Program to reverse the array and print.
//For E.g Input : arr[] = {a, b, c} Output : arr[] = {c, b, a}
public class Workout14
{
    public static void main(String[] args)
    {
      String arr[] = {"a","b","c"};
        for (int i = arr.length-1; i>=0; i--)
        {
            System.out.println(arr[i]);
        }

    }
}
