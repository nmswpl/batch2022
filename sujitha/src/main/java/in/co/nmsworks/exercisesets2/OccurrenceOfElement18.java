/*18. Given an array of integers and int x, Write a Program to print no of occurance of x in
the array
For E.g Input: arr[] = {1, 2, 3, 2, 2, 3}, x = 2; Output: 3 Reason: x (2) occurs 3
times in array*/
package in.co.nmsworks.exercisesets2;

public class OccurrenceOfElement18
{
    public static void main(String[] args)
    {
     int[] array={1,2,3,4,2,3,2,4,6,4,6,7,6} ;
     int occurrenceElement=6;
     int noOfOccurrence=0;
     for(int i=0;i< array.length;i++)
     {
         if(array[i]==6)
         {
             noOfOccurrence++;
         }
     }
        System.out.println(occurrenceElement+" is "+noOfOccurrence+" times occurred");
    }
}
