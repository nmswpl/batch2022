package in.co.nmsworks.training.program.exercise;


import java.util.Scanner;


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
