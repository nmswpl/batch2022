package in.co.nmsworks.excersise2;

//Write a program to print all even numbers between 601 and 700 in descending order:
public class DecendingOrder
{
    public static void main(String[] args)
    {
        for (int i=700;i>601;i--)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
