package exercise2;

import jdk.jshell.execution.JdiDefaultExecutionControl;

public class CountVCDS {

    //Counting the number of Vowels,Consonants,Digits,Spaces etc..
    public static void main(String[] args) {
        String string = "This website is aw3som3.";
        String str = string.toLowerCase();
        int vowels =0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;
        int dots=0;

        for (int i=0 ; i<str.length();i++)
        {
            char ch = str.charAt(i);

            if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;
            else if(ch > '0' && ch < '9')
                digits++;
            else if(ch == ' ')
                spaces++;
            else if(ch == '.')
                dots++;
            else
                consonants++;
        }

        System.out.println("Vowels: "+vowels + " Consonants: " +consonants + " Digits: "+digits + " Spaces: "+spaces);
    }
}
