/*22. Write a program to find Factors of a Positive Integer*/
package in.co.nmsworks.excercise1;

public class FactorsOfNumber22
{
    public static void main(String[] args)
    {
        int number=60;
        System.out.println("factors of 60 are: ");
        for(int i=1;i<=number;i++)
        {
            if(number%i==0)
            {
                System.out.print(" "+i);
            }
        }
    }
}
