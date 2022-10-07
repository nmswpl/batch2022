package in.co.nmsworks.excercise1;

import java.util.Scanner;

// find frequency of a character
public class Program24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter statement : ");
        String statement = in.nextLine();

        System.out.println("Enter character : ");
        char c = in.next().charAt(0);

        int freq = 0;
        for(int i=0; i<statement.length(); i++) {
            if(c == statement.charAt(i)) {
                freq += 1;
            }
        }

        System.out.println("frequency of " + c + " = " + freq);
    }
}
