package in.co.nmsworks.excersise2;


//Given an array of integers, Write a Program to find the sum of the elements of the array.
public class SumOfElementArray
{
    public static void main(String[] args)
    {
        int[] arr={10, 20, 30};
        int sum=0;

        for(int i=0;i< arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
