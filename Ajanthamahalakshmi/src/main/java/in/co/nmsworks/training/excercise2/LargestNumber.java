package in.co.nmsworks.training.excercise2;

public class LargestNumber {
    public static void main(String[] args)
    {
        int a =5;
        int b = 34;
        int c = 7;

        if(a>b && a>c)
        {
            System.out.println("largest value is "+a);

        } else if (b>a && b>c)
        {
            System.out.println("largest value is "+b);
        }
        else
        {
            System.out.println("largest value is "+c);
        }
    }
}
