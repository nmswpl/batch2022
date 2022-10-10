package in.co.nmsworks.exercise1;
//Write a program to Check Alphabet using if else
import java.util.Scanner;

public class practice11
{
    public static void main(String[] args)
    {
       Scanner s = new Scanner(System.in);
       System.out.println("ENTER THE CHARACTER: ");
       char ch1 = s.next().charAt(0);

//        char ch1 ='a';
        if((ch1 >= 'a'&& ch1 <= 'z')||(ch1 >= 'A' && ch1<= 'Z'))

        {
            System.out.println(ch1 +" is alphabet");
        }
        else
        {
            System.out.println(ch1 +" is not an alphabet");
        }

    }


}
