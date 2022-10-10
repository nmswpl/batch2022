package in.co.nmsworks.exercise1;
//Write a program to find Factors of a Positive Integer
public class practice22
{
    public static void main(String[] args)
    {
        int no = 60;

        for (int i = 1; i <= no; i++)
        {
           if(no%i==0)
               System.out.print(" " +i);

        }

    }
}
