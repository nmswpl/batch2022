package in.co.nmsworks.excercise2;
/*19. Given a String, Write a program to find if the string is palindrome or Not.
        E.g (1) Input: str = “level”; Output: Palindrome
        E.g (2) Input: str = “abc”; Output: Not Palindrome*/
import java.util.Scanner;

public class Palindrome19 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string ");
        String input= scanner.nextLine();

        if(isPalindrome(input))
        {
            System.out.println(input + " is a palindrome string ");
        }
        else
        {
            System.out.println(input + " is not a palindrome string");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


