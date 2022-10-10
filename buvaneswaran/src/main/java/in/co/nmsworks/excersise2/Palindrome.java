package in.co.nmsworks.excersise2;


//Given a String, Write a program to find if the string is palindrome or Not
public class Palindrome
{
    public static void main(String[] args) {

        String str = "level", reverseStr = "";

        for (int i = str.length()-1; i >=0; --i)
        {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.equalsIgnoreCase(reverseStr)) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}
