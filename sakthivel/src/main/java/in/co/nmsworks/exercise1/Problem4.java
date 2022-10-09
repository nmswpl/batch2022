package in.co.nmsworks.exercise1;

public class Problem4
{
    public static void swapping()
    {
        double a=1.2;
        double b=2.45;
        double c;
        System.out.println("--Before Swap--");
        System.out.println("First Number is :"+ a);
        System.out.println("Second Number is :"+ b);
        c=a;
        a=b;
        b=c;
        System.out.println("----After Swap----");
        System.out.println("First Number is :"+ a);
        System.out.println("Second Number is :"+ b);

    }

    public static void main(String[] args) {
        swapping();
    }
}
