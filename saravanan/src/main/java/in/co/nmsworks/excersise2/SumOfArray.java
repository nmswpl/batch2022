package in.co.nmsworks.excersise2;

public class SumOfArray
{
    public static void main(String[] args)
    {
        int[] arr={34,56,43,5};
        int sum=0;
        for(int i=0;i< arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("sum of array "+sum);
    }
}
