package in.co.nmsworks.training;

public class TriangleAlphabet
{
    public static void main(String[] args)
    {
        for(int x='a';x<='e';x++)
        {
            for (int i = 1; i <= 5; i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    System.out.print(" "+((char)x));
                }
                x++;
                System.out.println("\n");
            }
        }

    }
}
