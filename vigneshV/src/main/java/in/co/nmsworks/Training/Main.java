package in.co.nmsworks.Training;

import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args) {

        Map<Character, Integer> hashmap = new HashMap<Character,Integer>();
        String keyboard = "8459761203";
        String word = "5439";
        for(int i=0; i<keyboard.length(); i++) {
            hashmap.put(keyboard.charAt(i),i);
        }

        int diff =hashmap.get(word.charAt(0));
        System.out.println(diff);
        for(int i=1; i<word.length(); i++) {
            int n = hashmap.get(word.charAt(i));
            int m = hashmap.get(word.charAt(i-1));
            System.out.println("n= " +n+ " m= "+m);
            diff = diff + Math.abs(n-m);
        }

        System.out.println(diff);

    }
}

