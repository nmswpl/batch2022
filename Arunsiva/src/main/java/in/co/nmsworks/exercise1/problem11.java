public class problem11 {
    //Write a program to Check Alphabet using if else
    public static void main(String[] args) {
        char alp= 'j';
        if(alp>='a' && alp<='z' || alp>='A' && alp<='Z'){
            System.out.println(alp+ " is a Alphabet");
        }
        else {
            System.out.println(alp+ " is not a Alphabet");
        }
    }
}
