package in.co.nmsworks.Excersice2;

public class PrintAllNumbersDivisibleBy3
{
    public static void main(String[] args)
    {
        for (int i =  301 ; i < 400 ; i++)
        {
            if(i % 3 == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
