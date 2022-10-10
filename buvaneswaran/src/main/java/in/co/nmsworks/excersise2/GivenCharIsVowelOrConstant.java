package in.co.nmsworks.excersise2;


//Write a program to check if a given Character is a Vowel or Consonant.
public class GivenCharIsVowelOrConstant
{
    public static void main(String[] args)
    {
        char ch = 'i';
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
    }
}
