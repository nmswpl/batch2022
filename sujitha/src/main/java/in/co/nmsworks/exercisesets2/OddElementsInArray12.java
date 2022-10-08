/*12. Given an array of integers, Write a Program to print number of odd elements.
For E.g Input : arr[] = {32, 43, 4, 15} Output : Odd elements = 2 Reason : 43 & 15
are odd.*/
package in.co.nmsworks.exercisesets2;

public class OddElementsInArray12
{
    public static void main(String[] args)
    {

        int count=0;
        int[] arr={34,43,65,71,23,44,66,67};
        for (int i=0;i< arr.length;i++)
        {
            if (arr[i]%2!=0)
            {
                count++;
            }
        }
        System.out.println("no of odd elements in array: "+count);
    }
}
