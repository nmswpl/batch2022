package in.co.nmsworks.excersise2;


//Write a program to print all numbers between 200 and 500 ending with 7.
public class PrintNumberEndWithSeven
{
    public static void main(String[] args)
    {
        for(int i=200;i<=500;i++)
        {
            int temp = i % 10;
            if(temp == 7)
            {
                System.out.println(" "+i);
            }
        }
    }
}

