package in.co.nmsworks.excersise2;


//Given an array of integer, Write a Program to find the largest element in the given array.
public class LargestElementInArray
{
    public static void main(String[] args)
    {
        int[] a={12, 3, 20, 14};
        int max=a[0];

        for (int i=0;i<a.length;i++)
        {
            if (a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("Largest Element in the Array is :" + max);
    }
}
