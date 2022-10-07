package in.co.nmsworks.exercise2;
// Program to count and print even elements.
public class NoOfEvenElements
{
    public static void main(String[] args)
    {
        int[] array = {2,3,4,5,6};
        int noOfEvenElements = 0;
        for (int even:array)
        {
            if (even % 2 == 0)
            {
                System.out.print(even + " ");
                noOfEvenElements ++;
            }
        }
        System.out.println("No of Even Elements : " + noOfEvenElements);
    }
}
