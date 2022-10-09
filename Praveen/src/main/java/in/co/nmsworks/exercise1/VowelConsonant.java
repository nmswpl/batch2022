//program to Check whether an alphabet is vowel or consonant using if..else statement
public class VowelConsonant {
    public  void printChar(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u')
        {
            System.out.println("Vowel");

        }
        else
        {
            System.out.println("Consonant");

        }
    }

    public static void main(String[] args) {
        VowelConsonant exe8=new VowelConsonant();
        exe8.printChar('i');
    }
}
