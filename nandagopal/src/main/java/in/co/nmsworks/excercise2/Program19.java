package in.co.nmsworks.excercise2;
// find if the string is palindrome or Not
public class Program19 {
    public static void main(String[] args) {
        String str = "madam";
        int n = str.length();

        for(int i=0; i<n/2; i++) {
            if(str.charAt(i) != str.charAt((n-1) - i)) {
                System.out.println("Not Palindrome");
                return;
            }
        }

        System.out.println("Palindrome");
    }
}
