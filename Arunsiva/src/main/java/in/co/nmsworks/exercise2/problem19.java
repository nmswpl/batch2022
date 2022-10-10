package in.co.nmsworks.exercise2;
//Given a String, Write a program to find if the string is palindrome or Not.
public class problem19 {
    public static void main(String[] args) {
        String  str="arun";
        String rev="";
        for(int i=0;i<str.length();i++)
        {
            rev=str.charAt(i)+rev;
        }

        System.out.println("the reverse string given word" +str+  "is = "+rev);

        if(str.equals(rev)){
            System.out.println("The Given String is palindrome");
        }
        else{
            System.out.println("The Given String is Not a Palindrome");
        }
    }
}
