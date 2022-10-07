package in.co.nmsworks.excersise1;

public class Swap
{
    public static void main(String[] args)
    {
        double a=1.2,b=2.45;
        double temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap a:" + a);
        System.out.println("After Swap b:" + b);
    }
}
