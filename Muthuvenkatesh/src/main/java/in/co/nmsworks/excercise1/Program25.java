// 25. Write a program to count vowels, consonants, digits, and spaces
import java.util.HashSet;
import java.util.Set;

public class Program25 {
    public static void main(String[] args) {
        String s = "This website is aw3som3.";
        String s1 = s.toLowerCase();
        int vowelCount =0;
        int consonantCount =0;
        int digitCount =0;
        int spaceCount =0;

        Set <Character> vowel = new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');

        Set <Character> consonant = new HashSet<>();
        //char[] alphabet= {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        consonant.add('b');
        consonant.add('c');
        consonant.add('d');
        consonant.add('f');
        consonant.add('g');
        consonant.add('h');
        consonant.add('j');
        consonant.add('k');
        consonant.add('l');
        consonant.add('m');
        consonant.add('n');
        consonant.add('p');
        consonant.add('q');
        consonant.add('r');
        consonant.add('s');
        consonant.add('t');
        consonant.add('v');
        consonant.add('w');
        consonant.add('x');
        consonant.add('y');
        consonant.add('z');

        Set <Character> space = new HashSet<>();
        space.add(' ');

        Set <Character> digit = new HashSet<>();
        digit.add('0');
        digit.add('1');
        digit.add('2');
        digit.add('3');
        digit.add('4');
        digit.add('5');
        digit.add('6');
        digit.add('7');
        digit.add('8');
        digit.add('9');

        for(int i=0;i<s.length();i++){
            char character = s1.charAt(i);
            if(vowel.contains(character)){
                vowelCount++;
            }
            if(consonant.contains(character)){
                consonantCount++;
            }
            if(digit.contains(character)){
                digitCount++;
            }
            if(space.contains(character)){
                spaceCount++;
            }
        }
        System.out.println("V: "+vowelCount);
        System.out.println("C: "+consonantCount);
        System.out.println("D: "+digitCount);
        System.out.println("W: "+spaceCount);
    }
}
