/*13. Given an array of integers, Write a Program to find the sum of the elements of the
array.
For E.g Input : arr[] = {1, 2, 3} Output : 6 Reason : 1 + 2 + 3 = 6

 */



package in.co.nmsworks.exercise2;

public class SumOfElementsInArr
{
    public static void main(String[] args)
    {
        int[] arrNo={2,4,5,6,8};
        int sum=0;
            for (int i=0;i< arrNo.length;i++)
            {
                sum = sum + arrNo[i];
            }
            System.out.println(sum);

    }
}
