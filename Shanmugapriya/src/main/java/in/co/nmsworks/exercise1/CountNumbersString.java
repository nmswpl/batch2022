package in.co.nmsworks.exercise1;

import java.util.Scanner;
//Count umber of strings
public class CountNumbersString
{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = S.nextLine();

        System.out.println("Enter the Character to search");
        char ch = S.next().charAt(0);
        int count = 0;

        for( int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ch)
            {
                count++;
            }
        }
        System.out.println(str+" of "+ch+" is "+count);
    }
}
