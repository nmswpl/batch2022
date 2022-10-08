package in.co.nmsworks.exercise2;

public class Program5
{
    public static void divisibleByThree()
    {
        for(int i=300;i<=400;i++)
        {
            if(i%3==0)
            {
                System.out.println("Divisible by 3 :" + i);
            }
        }
    }

    public static void main(String[] args)
    {
        divisibleByThree();
    }
}
