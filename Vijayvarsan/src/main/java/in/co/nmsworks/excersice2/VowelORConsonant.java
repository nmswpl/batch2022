package in.co.nmsworks.excersice2;

public class VowelORConsonant {
    //5. Write a program to check if a given Character is a Vowel or Consonant.

    public static void main(String[] args) {
        char c='A';

        if ((c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ) ||
                (c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ))
            System.out.println("THE CHAR IS VOWEL");
        else
            System.out.println("THE CHAR IS CONSONANT");
    }
}
