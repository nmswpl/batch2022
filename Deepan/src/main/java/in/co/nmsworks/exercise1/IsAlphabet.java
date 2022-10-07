import java.util.Scanner;

public class IsAlphabet {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = get.next().charAt(0);

        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
        {
            System.out.println("It is Alphabet");
        }
        else {
            System.out.println("No");
        }
    }
}
