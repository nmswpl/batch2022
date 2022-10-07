package in.co.nmsworks.exercisetwo;;

public class Palindrome {
    public static void main(String[] args) {
        String str = "AMMA";
        System.out.println(ispallindrome(str));

    }


    private static boolean ispallindrome(String str) {
        int i=0;
        int j=str.length()-1;
        while(i<j)
        {
            char first = str.charAt(i);
            char last = str.charAt(j);
            if(first!=last)
                return false;
            i++;
            j--;
        }
        return true;
    }


}
