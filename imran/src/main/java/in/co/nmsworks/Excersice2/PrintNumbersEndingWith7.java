package in.co.nmsworks.Excersice2;

public class PrintNumbersEndingWith7
{
    public static void main(String[] args)
    {
        for ( int i = 200 ; i <= 700 ; i ++ )
        {
            if( i % 10 == 7)
            {
                System.out.print(i + " ");
            }
        }
    }
}
