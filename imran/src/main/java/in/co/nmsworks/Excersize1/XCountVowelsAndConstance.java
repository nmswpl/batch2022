import java.util.Scanner;

public class XCountVowelsAndConstance {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Statement : ");
        String str = inp.nextLine();

        int vowels = 0;
        int consonant = 0 ;
        int digits = 0;
        int spaces = 0;
        int specialcharacters = 0;
        for(int i = 0 ; i < str.length();i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) ==  'u' ||
               str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) ==  'U')
            {
               vowels++;
            }
            else if(str.charAt(i) >='a' && str.charAt(i) <='z' || str.charAt(i) >='A' && str.charAt(i) <='Z')
            {
                consonant++;
            }
            else if(str.charAt(i)>='0' && str.charAt(i) <= '9')
            {
                digits++;
            }
            else if(str.charAt(i) ==  ' ')
            {
                spaces ++;
            }
            else
            {
                specialcharacters ++;
            }
        }
        System.out.println("Vowels             : "+vowels);
        System.out.println("Consonant          : "+consonant);
        System.out.println("Digits             : "+digits);
        System.out.println("Spaces             : "+spaces);
        System.out.println("Special characters : "+specialcharacters);
    }
}
