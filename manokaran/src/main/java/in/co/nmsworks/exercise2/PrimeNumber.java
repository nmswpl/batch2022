package in.co.nmsworks.exercise2;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        int number = 10;
        boolean isprime = true;
        for (int i = 2; i < number; i ++)
        {
            if (number % i == 0)
            {
                isprime = false;
                break;
            }
        }
        if (isprime)
        {
            System.out.println(number + " is Prime Number");
        }
        else
        {
            System.out.println(number + " is not a Prime Number");
        }
    }
}
