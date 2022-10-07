package in.co.nmsworks.excercise1;
import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        {
            Scanner val=new Scanner(System.in);
            System.out.println("Enter a character : ");
            char ch=val.next( ).charAt(0);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                System.out.println(ch+" is  Vowel");
            }
            else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
                System.out.println(ch+" is Consonant");
            else
                System.out.println("Not an alphabet");
        }
    }
}
