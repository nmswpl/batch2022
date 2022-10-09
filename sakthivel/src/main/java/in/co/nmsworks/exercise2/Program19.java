package in.co.nmsworks.exercise2;

public class Program19
{
    public static void printAllNumbersEndingWithSeven()
    {
        for(int i=200;i<=500;i++)
        {
            if(i % 10 == 7)
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args)
    {
        printAllNumbersEndingWithSeven();
    }
}
