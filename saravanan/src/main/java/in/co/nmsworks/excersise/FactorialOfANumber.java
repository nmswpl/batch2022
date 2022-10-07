package in.co.nmsworks.excersise;

public class FactorialOfANumber
{
    public static void main(String[] args)
    {
        int factNumber=5;
        int res=1;
        while(factNumber>0)
        {
            res*=factNumber;
            factNumber--;
        }
        System.out.println(res);
    }
}
