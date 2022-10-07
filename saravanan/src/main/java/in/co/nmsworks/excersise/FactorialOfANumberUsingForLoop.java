package in.co.nmsworks.excersise;

public class FactorialOfANumberUsingForLoop
{
    public static void main(String[] args)
    {

       int res=1;
       for(int i=5;i>0;i--)
       {
           res*=i;
       }
        System.out.println(res);
    }

}
