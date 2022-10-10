//to print frequency of character

package in.co.nmsworks.exercise1;
import java.util.Scanner;

public class FrequencyOfCharacter24 {
    public static void main(String[] args) {
        System.out.println("Enter statement:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = 'e';
        int frequency = 0;

        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);
    }
}

