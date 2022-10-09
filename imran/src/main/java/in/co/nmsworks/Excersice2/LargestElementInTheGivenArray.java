package in.co.nmsworks.Excersice2;

public class LargestElementInTheGivenArray
{
    public static void main(String[] args)
    {
        int[] arr = {12, 3, 20, 14};
        int largest = 3;
        for ( int i :  arr)
        {
            if ( i  > largest)
            {
                largest = i;
            }
        }
        System.out.println(largest + "  is a largest number ");
    }
}
