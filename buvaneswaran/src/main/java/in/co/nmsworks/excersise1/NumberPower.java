package in.co.nmsworks.excersise1;

public class NumberPower
{
    public static void main(String[] args) {
        int n=3;
        int power=3;
        int result=1;
        for (int i=1;i<=power;i++)
        {
            result=result*n;
        }
        System.out.println("Power Value is : " + result);
    }
}
