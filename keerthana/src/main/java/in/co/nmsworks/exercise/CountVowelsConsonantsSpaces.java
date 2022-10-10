/*25. Write a program to count vowels, consonants, digits, and spaces

 */


package in.co.nmsworks.exercise;

public class CountVowelsConsonantsSpaces
{
    public static void main(String[] args) {
        String str="This is 1 of the awesome @#$ things";
        int vowels=0;
        int consonants=0;
        int spaces=0;
        int  digits=0;
        int specialChar=0;
        for(int i=0;i<=str.length()-1;i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                consonants++;
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (ch ==' ') {
                spaces++;
            } else {
                specialChar++;
            }
        }
        System.out.println("Vowels:" + vowels + "\nConsonants:" + consonants + "\nDigits:" + digits + "\nSpaces:" + spaces+"\nSpecial characters:"+specialChar);

    }
}
