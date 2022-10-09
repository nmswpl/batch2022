package in.co.nmsworks.Excersice2;

public class SumOfTheArray
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3};
        int count = 0;

        for(int i : arr)
        {
            count += i;

        }
        System.out.println("Sum of the array = " +  count);
    }
}
