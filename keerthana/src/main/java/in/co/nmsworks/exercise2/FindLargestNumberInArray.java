/*17. Given an array of integer, Write a Program to find the largest element in the given
array.
For E.g Input : arr[] = {12, 3, 20, 14} Output : Largest element = 20

 */


package in.co.nmsworks.exercise2;

public class FindLargestNumberInArray
{
    public static void main(String[] args)
    {
        int[] arr={1,4,6,84,12,76};
        int large=arr[0];
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] >large)
                {
                    large=arr[i];
                }
            }
        System.out.println("The largest element in the array:"+large);


    }
}
