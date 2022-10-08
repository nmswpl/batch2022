package in.co.nmsworks.exercise1;
//ASCII value of a character

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        for (int i = 65; i <=122 ; i++) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the number");
            int n= scanner.nextInt();
            i=(char)n;
            System.out.println((char)i);

        }



    }
}
