// 19. Given a String, Write a program to find if the string is palindrome or Not.
package in.co.nmsworks.exercise2;

public class Program19 {
    public static void main(String[] args) {
        String str = "malayalam";
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("Not a pallindrome");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("is a pallindrome");
    }
}
