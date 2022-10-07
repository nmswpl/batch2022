/*15. Given an array of integers, Write a Program to count and print even elements.
For E.g Input : arr[] = {2, 3, 4, 5, 6} Output : even elements = 3
Reason : 2 4 & 6 are even*/
package in.co.nmsworks.exercisesets2;

public class CountOfEvenElements15
{
    public static void main(String[] args)
    {
     int[] array={1,2,3,4,5,6,7,8,9,10};
     int count=0;
     for(int i=0;i< array.length;i++)
     {
         if(array[i]%2==0)
         {
             count++;
         }
     }
        System.out.println("count of even elements in array is "+count);
    }

}
