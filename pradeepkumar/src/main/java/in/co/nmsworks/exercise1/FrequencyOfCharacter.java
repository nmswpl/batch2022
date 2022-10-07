package in.co.nmsworks.exercise1;
//program for search the character

import java.util.Scanner;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String s ="This website is awesome";
        char search='e';
        int count=0;

        for (int i = 0; i < s.length(); i++) {
            if (search==s.charAt(i))
            {
                count ++;
            }

        }
        System.out.println(count);
    }
}
