
package in.co.nmsworks.excersise2;

public class PalindromeOrNot
{
    public static void main(String[] args)
    {
        String s="abc";
        String  temp="";
        for(int i=s.length()-1;i>=0;i--)
        {
            temp= temp + s.charAt(i);
        }
        if(s.equals(temp))
        {
            System.out.println(s+" is palindrome");
        }
        else
        {
            System.out.println(s+ " is not a palindrome");
        }
    }

}
