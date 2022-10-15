package in.co.nmsworks.exercise1;


public class Program20
{
    public static void countNumberOfDigits()
    {
        int count = 0;
        int num=4532;
        while(num != 0)
        {
            num = num / 10;
            count++;
        }
        System.out.println("Number of digits count:" + count);

    }

    public static void main(String[] args)
    {
        countNumberOfDigits();
    }
}
