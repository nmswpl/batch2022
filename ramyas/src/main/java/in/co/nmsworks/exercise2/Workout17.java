package in.co.nmsworks.exercise2;

//17. Given an array of integer, Write a Program to find the largest element in the given
//array.
//For E.g Input : arr[] = {12, 3, 20, 14} Output : Largest element = 20
public class Workout17
{
    public static void main(String[] args)
    {
        int[] arr = {12, 3, 20, 14};
        int large = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i]>large)
             large = arr[i];
        }
        System.out.println(large);
//        int large = Arrays.stream(arr).max().getAsInt();
//        System.out.println(large);
    }
}
