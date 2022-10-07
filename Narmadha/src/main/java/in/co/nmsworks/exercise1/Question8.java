package in.co.nmsworks.exercise1;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        //Check whether an alphabet is vowel or consonant using if else=
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a char: ");
        char ch=sc.next().charAt(0);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    System.out.println(ch +" is an vowel");
                }
                else {
                    System.out.println("it is a consonant");
                }

    }
}
