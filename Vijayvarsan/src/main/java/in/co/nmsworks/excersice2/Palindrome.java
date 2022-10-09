package in.co.nmsworks.excersice2;

public class Palindrome {

    //19. Given a String, Write a program to find if the string is palindrome or Not.
    //E.g (1) Input: str = “level”; Output: Palindrome
    //E.g (2) Input: str = “abc”; Output: Not Palindrome

        public static void main(String[] args) {
         String str="level";
         String rev="";
         for (int i=str.length()-1;i>=0;i--)
         {
             rev = rev+str.charAt(i);
         }
         if(str.equals(rev))
             System.out.println("IS A PALINDROME");
         else
             System.out.println("NOT A PALINDROME");
        }
    }