// 11. Write a program to Check Alphabet using if else
import java.util.ArrayList;
import java.util.Collections;

public class Program11 {
    public static void main(String[] args) {
        ArrayList <String> array = new ArrayList<String>();
        String[] alphabet= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String character = "*";
        Collections.addAll(array,alphabet);
        if(array.contains(character)){
            System.out.println(character+" is an alphabet");
        }
        else{
            System.out.println(character+" is not an alphabet");
        }
    }
}

