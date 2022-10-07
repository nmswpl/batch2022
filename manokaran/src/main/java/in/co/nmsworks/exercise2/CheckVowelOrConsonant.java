package in.co.nmsworks.exercise2;
// Check character is vowel or consonant

public class CheckVowelOrConsonant
{
    public static void main(String[] args)
    {
        char character = 'a';
        System.out.println("Character : " + character);
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
        {
            System.out.println(character + " is a Vowel Character");
        }
        else
        {
            System.out.println(character + " is a Consonant");
        }
    }
}
