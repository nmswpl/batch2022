package in.co.nmsworks.excercise1;
import java.util.Scanner;
public class CharacterTypeCount {
    public static void main(String[] args) {
        String statement;
        int vowels=0,consonant=0,digits=0,spaces=0;
        Scanner inputObject=new Scanner(System.in);
        System.out.print("Enter the statement:");
        statement=inputObject.nextLine();
        for (int i=0; i<statement.length(); i++)
        {
            if(statement.charAt(i)=='a'|| statement.charAt(i)=='e'|| statement.charAt(i)=='i'||
                    statement.charAt(i)=='o'||statement.charAt(i)=='u'|| statement.charAt(i)=='A'|| statement.charAt(i)=='E'||
                    statement.charAt(i)=='I'||statement.charAt(i)=='O'||statement.charAt(i)=='U')
            {
                vowels++;
            }
            else if (statement.charAt(i) >= 'a' && statement.charAt(i) <= 'z' ||
                        statement.charAt(i)>='A'&& statement.charAt(i)<='Z')
            {
                consonant++;
            }
            else if (statement.charAt(i)>='0'&&statement.charAt(i)<='9')
            {
                digits++;
            }
            else if(statement.charAt(i)==' ')
            {
                spaces++;
            }
        }
        System.out.println("Vowels: "+vowels+"\nConsonant: "+consonant+"\nDigits: "+digits+"\nspaces: "+spaces);
    }
}
