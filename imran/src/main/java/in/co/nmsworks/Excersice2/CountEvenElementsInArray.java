package in.co.nmsworks.Excersice2;

public class CountEvenElementsInArray
{
    public static void main(String[] args)
    {

        int[] arr = {2, 3, 4, 5, 6};
        int count = 0;

        for (int i : arr)
        {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Even elements = " +count);

    }
}
