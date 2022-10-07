package in.co.nmsworks.excercise1;
import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        char alphabet;
        Scanner inputObject=new Scanner(System.in);
        alphabet=inputObject.next().charAt(0);
        if(alphabet=='a'|| alphabet=='e'|| alphabet=='i'||alphabet=='o'|| alphabet=='u'||
        alphabet=='A'||alphabet=='E'||alphabet=='I'||alphabet=='O'||alphabet=='U')
        {
            System.out.println(alphabet+" is Vowel");
        }
        else
        {
            System.out.println(alphabet+" is consonant");
        }
    }
}
