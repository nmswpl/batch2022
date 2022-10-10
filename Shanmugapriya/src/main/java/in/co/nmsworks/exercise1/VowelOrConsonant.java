package in.co.nmsworks.exercise1;


import java.util.Scanner;

// vowel or consonant
public class VowelOrConsonant
{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char ch = S.next().charAt(0);

        if(ch=='a'||ch == 'A'||ch=='e'||ch == 'E'||ch=='i'||ch == 'I'||ch=='o'||ch == 'O'||ch=='u'||ch == 'U'){
            System.out.println(ch+" is vowel");
        }
        else
        {
            System.out.println(ch+" is consonant");
        }
    }
}
