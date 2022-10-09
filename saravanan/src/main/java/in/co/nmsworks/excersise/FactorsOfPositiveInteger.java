package in.co.nmsworks.excersise;

public class FactorsOfPositiveInteger
{
    public static void main(String[] args)
    {
        int number =60;
        for(int i=1;i<=60;i++)
        {
            if(number % i ==0)
            {
                System.out.print( i+"  ");
            }
        }
    }
}
