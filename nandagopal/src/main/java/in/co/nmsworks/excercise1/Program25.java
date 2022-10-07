package in.co.nmsworks.excercise1;

import java.util.Scanner;

// count vowels, consonants, digits, spaces
public class Program25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter statement : ");
        String statement = in.nextLine();

        int vc = 0;
        int cc = 0;
        int dc = 0;
        int wc = 0;

        for(int i=0; i<statement.length(); i++) {
            char c = Character.toLowerCase(statement.charAt(i));

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vc += 1;
                continue;
            }
            if(c >= 'a' && c <= 'z') {
                cc += 1;
                continue;
            }
            if(c >= 48 && c <= 57) {
                dc += 1;
                continue;
            }
            if(c == 32) {
                wc += 1;
            }
        }

        System.out.println("V: " + vc);
        System.out.println("C: " + cc);
        System.out.println("D: " + dc);
        System.out.println("W: " + wc);
    }
}
