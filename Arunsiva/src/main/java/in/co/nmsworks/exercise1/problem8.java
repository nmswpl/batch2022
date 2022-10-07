public class problem8 {

    //Write a program to Check whether an alphabet is vowel or consonant using if else
    //statement

    public static void main(String[] args) {
        char alp = 'F';

        if(alp == 'a' || alp == 'e' || alp == 'i' || alp == 'o' || alp == 'u' || alp == 'A' || alp == 'E' || alp == 'I' || alp == 'O' || alp == 'U' )
            System.out.println(alp + " is vowel");
        else
            System.out.println(alp + " is consonant");
    }
}
