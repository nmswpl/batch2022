//program to Compute Quotient and Remainder
public class RemainderQuotient {

    public void printNum(int divident,int divisor)
    {
        int q=divident/divisor;
        System.out.println("Quotient="+q);
        int r=divident % divisor;
        System.out.println("Remainder="+r);

    }

    public static void main(String[] args) {
        RemainderQuotient exe5=new RemainderQuotient();
        exe5.printNum(49,8);
    }
}
