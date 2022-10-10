package in.co.nmsworks.exercise1;
//Write a program to Check whether an alphabet is vowel or consonant using if..else statement
public class practice8
{
    public static void main(String[] args)
    {
        char ch = 'a';
        if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'||ch == 'u')
        {
            System.out.println(ch +" is Vowel");

        }
        else
        {
            System.out.println(ch +" is Consonant");
        }
    }
}
