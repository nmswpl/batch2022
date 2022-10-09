package in.co.nmsworks.exercise2;
//Write a Program to find the sum of the elements of the array.
public class SumArray {
    public static void main(String[] args)
    {
        int sum=0;
        int[] arr={12,35,21,18,5,9};
        for (int i = 0; i < arr.length; i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
