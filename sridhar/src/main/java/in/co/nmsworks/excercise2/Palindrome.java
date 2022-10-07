package in.co.nmsworks.excercise2;

public class Palindrome {
    public static void main(String[] args) {
        String str="level";
        int flag=0;
        for (int i=0;i<=str.length()/2;i++)
        {
            if (str.charAt(i) != str.charAt(str.length()-1-i))
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
