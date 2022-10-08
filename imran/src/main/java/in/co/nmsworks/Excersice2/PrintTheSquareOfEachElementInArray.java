package in.co.nmsworks.Excersice2;

public class PrintTheSquareOfEachElementInArray
{
    public static void main(String[] args)
    {
        int[] arr = {2,4,3,5};

        System.out.print("Square of each element = ");
        for (int i : arr)
        {
            System.out.print( i*i + " ");
        }
    }
}
