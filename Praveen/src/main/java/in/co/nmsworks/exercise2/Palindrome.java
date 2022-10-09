package in.co.nmsworks.exercise2;
//Write a program to find if the string is palindrome or Not.
public class Palindrome {
    public static void main(String[] args) {
        String s = "level";
        String rev = "";


        for (int i = 0; i < s.length(); i++) {

            rev = s.charAt(i) + rev;
        }
        if (s==rev)
        {
            System.out.println("Palindrome");

        } else {
            System.out.println("Not a Palindrome");

        }
    }
}
