package in.co.nmsworks.exercise2;
// Divisible of 3 beteween 300 to 400
public class DivisibleOfThree
{
    public static void main(String[] args)
    {
        for (int i = 300; i <= 400; i ++)
        {
            if (i % 3 == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
