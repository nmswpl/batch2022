package in.co.nmsworks.excersise;

public class LargestAmongThreeNumber
{
    public static void main(String[] args)
    {
        int a=60,b=80,c=90;
        if(a>b && a>c)
        {
            System.out.println(a+"is large");
        }
        else if(b>c)
        {
            System.out.println(b+" is large");

        }
        else
        {
            System.out.println(c+" is large");
        }


    }
}
