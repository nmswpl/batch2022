import java.util.Scanner;

//Checking the given alphabet is vowel or not
public class VowelChecker {


    public static void main(String[] args) {
        Scanner get =new Scanner(System.in);

        System.out.println("Enter the character:");
        char ch =get.next().charAt(0);

        if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U')
        {
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}
