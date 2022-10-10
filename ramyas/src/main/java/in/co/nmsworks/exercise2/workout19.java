package in.co.nmsworks.exercise2;
//Given a String, Write a program to find if the string is palindrome or Not.

//E.g (1) Input: str = “level”; Output: Palindrome

//E.g (2) Input: str = “abc”; Output: Not Palindrome

public class workout19
{
    public static void main(String[] args)
    {
        String str1 = "level";
        String reverse = "";
        for (int i = str1.length()-1; i >= 0; i--)
        {
            reverse = reverse + str1.charAt(i);
        }
        if (str1.equals(reverse))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}
