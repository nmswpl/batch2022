import java.util.Scanner;

public class HVowelOrConstant {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a alphabet : ");
        char alphabet = inp.next().charAt(0);
        alphabet = Character.toLowerCase(alphabet);
        if(alphabet == 'a' || alphabet == 'e' ||alphabet == 'i' ||alphabet == 'o' ||alphabet == 'u' )
        {
            System.out.println(alphabet+" is Vowel");
        }
        else
        {
            System.out.println(alphabet+" is Consonant");

        }
    }
}
