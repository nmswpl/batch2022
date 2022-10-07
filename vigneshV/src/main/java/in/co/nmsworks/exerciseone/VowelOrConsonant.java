package in.co.nmsworks.exerciseone;
import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        char alpha;
        Scanner input=new Scanner(System.in);
        alpha=input.next().charAt(0);
        if(alpha=='a'|| alpha=='e'|| alpha=='i'||alpha=='o'|| alpha=='u'||
        alpha=='A'||alpha=='E'||alpha=='I'||alpha=='O'||alpha=='U')
        {
            System.out.println(alpha+" is Vowel");
        }
        else
        {
            System.out.println(alpha+" is consonant");
        }
    }
}
