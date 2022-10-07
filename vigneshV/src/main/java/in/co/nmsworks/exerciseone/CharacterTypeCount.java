package in.co.nmsworks.exerciseone;
import java.util.Scanner;
public class CharacterTypeCount {
    public static void main(String[] args) {
        String word;
        int vowels=0,consonant=0,digits=0,spaces=0;
        Scanner inputObject=new Scanner(System.in);
        System.out.print("Enter the word:");

        word=inputObject.nextLine();
        for (int i=0; i<word.length(); i++)
        {
            if(word.charAt(i)=='a'|| word.charAt(i)=='e'|| word.charAt(i)=='i'||
                    word.charAt(i)=='o'||word.charAt(i)=='u'|| word.charAt(i)=='A'|| word.charAt(i)=='E'||
                    word.charAt(i)=='I'||word.charAt(i)=='O'||word.charAt(i)=='U')
            {
                vowels++;
            }
            else if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z' ||
                        word.charAt(i)>='A'&& word.charAt(i)<='Z')
            {
                consonant++;
            }
            else if (word.charAt(i)>='0'&&word.charAt(i)<='9')
            {
                digits++;
            }
            else if(word.charAt(i)==' ')
            {
                spaces++;
            }
        }
        System.out.println("Vowels: "+vowels+"\nConsonant: "+consonant+"\nDigits: "+digits+"\nspaces: "+spaces);
    }
}
