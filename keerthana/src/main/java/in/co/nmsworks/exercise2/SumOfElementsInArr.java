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
