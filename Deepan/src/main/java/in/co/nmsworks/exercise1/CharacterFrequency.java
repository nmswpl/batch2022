import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = get.next().charAt(0);

        String str = "This website is awesome.";
        int count=0;
        for (int i=0 ; i<str.length();i++)
        {
            if(ch == str.charAt(i))
            {
                count++;
            }
        }
        System.out.println("Count of "+ch+ " = "+count);
    }
}
