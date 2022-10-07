import java.util.Scanner;

public class KAlphabetOrNot {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = inp.next().charAt(0);
        if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
        {
            System.out.println(ch +" is Alphabet");
        }
        else
        {
            System.out.println(ch +" is not a Alphabet");
        }
    }
}
