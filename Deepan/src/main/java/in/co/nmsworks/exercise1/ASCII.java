import java.util.Scanner;

public class ASCII {

    //Printing ASCII value of given character
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.println("Enter the character:");
        char ch = get.next().charAt(0);

        int value = (int) ch;
        System.out.println(value);
    }
}
