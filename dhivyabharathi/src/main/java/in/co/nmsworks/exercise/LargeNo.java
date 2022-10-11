package in.co.nmsworks.exercise;
//9. Write a program to Find Largest Among three numbers using if..else statement
public class LargeNo
{
    public static void main(String[] args)
    {
        int n1 = 3,n2 = 2 , n3 = 5;
        if(n1>n2 && n1>n3)
        {
            System.out.println(n1+" is Large");
        } else if (n2>n1 && n2>n3)
        {
            System.out.println(n2+" is large");
        }
        else
        {
            System.out.println(n3+" is large");
        }
    }
}
