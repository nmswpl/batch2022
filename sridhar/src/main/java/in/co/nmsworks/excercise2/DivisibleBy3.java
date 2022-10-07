package in.co.nmsworks.excercise2;

public class DivisibleBy3 {
    public static void main(String[] args)
    {
        for (int i=301; i<400; i++)
        {
            if (i % 3 == 0)
            {
                System.out.print(i+ " ");
            }
        }
    }
}
