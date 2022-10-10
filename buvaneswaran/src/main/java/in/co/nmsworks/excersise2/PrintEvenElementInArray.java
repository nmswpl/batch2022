package in.co.nmsworks.excersise2;


//Given an array of integers, Write a Program to count and print even elements.
public class PrintEvenElementInArray
{
    public static void main(String[] args)
    {
        int[] arr={2,8,4,0,6};
        int count=0;
        int i=0;
        while (i< arr.length)
        {
            if (arr[i]%2==0)
            {
                count++;
            }
            i++;
        }
        System.out.println("Number of even elements in given array : " + count);
    }
}
