package in.co.nmsworks.exercise2;
// Write a program to find if the string is palindrome or Not.
public class Palindrome
{
    public static void main(String[] args)
    {
        String value = "malayalam";
        String reverseString = "";
        for (int i = value.length()-1; i >= 0;i--)
        {
            reverseString += value.charAt(i);
        }
        if (value.equals(reverseString))
        {
            System.out.println(value + " is Palindrome");
        }
        else
        {
            System.out.println(value + " is not Palindrome");
        }
    }
}
