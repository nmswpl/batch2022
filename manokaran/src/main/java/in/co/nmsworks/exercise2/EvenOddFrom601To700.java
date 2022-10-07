package in.co.nmsworks.exercise2;
// Even or Odd Numbers From 601 to 700
public class EvenOddFrom601To700
{
    public static void main(String[] args)
    {
        for (int i = 700; i > 600; i --)
        {
            if (i % 2 == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
