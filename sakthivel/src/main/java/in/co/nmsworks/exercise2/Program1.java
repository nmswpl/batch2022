package in.co.nmsworks.exercise2;

public class Program1
{
    public static void evenNumberBwGivenNumber()
    {
        int count = 0;
        for (int i = 700; i >= 601; i--)
        {
            if (i % 2 == 0)
            {
                System.out.println("print even number : "+i);
            }
        }
    }

    public static void main(String[] args)
    {
        evenNumberBwGivenNumber();
    }
}
