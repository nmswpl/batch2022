/*17. Given an array of integer, Write a Program to find the largest element in the given
array.
For E.g Input : arr[] = {12, 3, 20, 14} Output : Largest element = 20*/
package in.co.nmsworks.exercisesets2;

public class LargestElementInArray17
{
    public static void main(String[] args) {
        int[] array={2,4,5,65,71,32,45};
        int largestElement=array[0];
        for(int i=0;i< array.length;i++)
        {
            if(array[i]>largestElement)
            {
                largestElement=array[i];

            }
        }
        System.out.println(largestElement);
    }
}
