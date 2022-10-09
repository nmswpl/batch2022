package in.co.nmsworks.exercise1;

public class Program16
{
    public static void factorsOfPositiveInteger()
    {
        int num=60;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.println("Factors of 60 are :"+i);
            }
        }
    }

    public static void main(String[] args)
    {
        factorsOfPositiveInteger();
    }
}
