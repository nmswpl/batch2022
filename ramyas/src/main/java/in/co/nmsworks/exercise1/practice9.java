package in.co.nmsworks.exercise1;
//Write a program to Find Largest Among three numbers using if..else statement.
public class practice9
{
    public static void main(String[] args)
    {
        int a = 100;
        int b = 54;
        int c = 19;
        if(a>b && a>c)
        {
            System.out.println(a +" is largest number");
        }
        else if(b>a && b>c)
        {
            System.out.println(b +" is largest number");
        }
        else
        {
            System.out.println(c +" is largest number");
        }

    }
}
