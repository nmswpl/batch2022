package in.co.nmsworks.excercise1;

// 8. Write a program to Check whether an alphabet is vowel or consonant using if..else statement
public class Program8 {
    public static void main(String[] args) {
        char character = 'A';
        if(character == 'a'|| character == 'e'|| character == 'i'|| character == 'o'|| character == 'u' || character == 'A'|| character == 'E'|| character == 'I'|| character == 'O'|| character == 'U') {
            System.out.println(character + " is an vowel");
        }
        else{
            System.out.println(character + " is an consonant");
        }
    }
}
