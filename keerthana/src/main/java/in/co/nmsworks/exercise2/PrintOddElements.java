/*12. Given an array of integers, Write a Program to print number of odd elements.
For E.g Input : arr[] = {32, 43, 4, 15} Output : Odd elements = 2 Reason : 43 & 15
are odd.

 */


package in.co.nmsworks.exercise2;

public class PrintOddElements
{
    public static void main(String[] args)
    {
        int[] arr={1,34,54,23,67,44,87,56};
        int count=0;
            for (int i = 0; i < arr.length; i++)
            {

                    if (arr[i] % 2 != 0) {
                        System.out.print(arr[i]+" ");
                        count++;
                    }
                }


        System.out.println("\nOdd numbers count in array: "+count);

    }
}
