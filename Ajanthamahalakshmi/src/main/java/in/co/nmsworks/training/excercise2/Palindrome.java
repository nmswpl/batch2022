package in.co.nmsworks.training.excercise2;

import static jdk.nashorn.internal.objects.NativeString.charAt;

public class Palindrome {
    public static void main(String[] args) {
        String str = "AJA";
        String revStr = "" ;

        for(int i=0; i<str.length();i++)
        {
            revStr = revStr + str.charAt(i);
            System.out.println(revStr);
        }
        if(str.equals(revStr))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
}
