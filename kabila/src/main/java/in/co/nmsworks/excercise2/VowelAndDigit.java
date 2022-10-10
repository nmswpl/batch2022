package in.co.nmsworks.excercise2;
 import java.util.Scanner;
public class VowelAndDigit {
    public static void main(String[] args)
    {
        System.out.println("ENTER STATEMENT : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vowels=0;
        int consonant = 0;
        int digit = 0;
        int whitespace = 0;
        for (int i = 0; i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;
            else if (ch >= 'a' && ch <= 'z')
            {
                consonant++;
            }
            else if (ch >= '0' && ch <= '9' )
            {
                digit++;
            }
            else if (ch == ' ')
            {
                whitespace++;
            }

        }
        System.out.println("V : " +vowels);
        System.out.println("C : " +consonant);
        System.out.println("D : " +digit);
        System.out.println("W : " +whitespace);
    }
}



