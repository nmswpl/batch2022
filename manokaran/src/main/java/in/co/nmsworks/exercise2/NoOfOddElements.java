package in.co.nmsworks.exercise2;
// print number of odd elements.
public class NoOfOddElements
{
    public static void main(String[] args)
    {
        int[] array = {32,43,4,15};
        int noOfOddElements = 0;
        for (int odd:array)
        {
            if (odd % 2 != 0)
            {
                noOfOddElements ++;
            }
        }
        System.out.println("No of Odd Elements in the array : " + noOfOddElements);
    }
}
