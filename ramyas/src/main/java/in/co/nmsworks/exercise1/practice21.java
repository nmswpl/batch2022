package in.co.nmsworks.exercise1;
//Write a program to Check Prime Number using a for loop
public class practice21
{
    public static void main(String[] args)
    {
        int no = 20;
        int flag = 0;

        for (int i=2; i<=no/2; i++)
        {
            if(no%i == 0)
                flag = 1;
            break;

        }
        if(flag == 0)
            System.out.println("prime number");
        else
            System.out.println("not a prime no");
    }
}
