import java.util.Scanner;

public class WFreaquencyOfCharacter {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
       System.out.print("Enter Statement : ");
       String str = inp.nextLine();
       str = str.toLowerCase();
       System.out.print("Enter a letter you want to search : ");
        char ch = inp.next().charAt(0);
        ch = Character.toLowerCase(ch);
        int count = 0;
        for(int i = 0 ; i < str.length();i++)
        {
            if(str.charAt(i) == ch)
            {
                count ++;
            }
        }
        System.out.println(ch + " is present : " +count);
    }
}
