package in.co.nmsworks.exercise;

import java.util.Scanner;

public class CountVowelsConsonant
{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = S.nextLine();

        int v = 0;
        int c = 0;
        int d = 0;
        int s = 0;
        int specialchar = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if((str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o'|| str.charAt(i) =='u') || (str.charAt(i) == 'A'|| str.charAt(i) == 'E'|| str.charAt(i) == 'I' || str.charAt(i) == 'O'|| str.charAt(i) =='U'))
            {
                v++;
            }
            else if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ) || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' ))
            {
                c++;
            }
            else if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
            {
                d++;
            }
            else if(str.charAt(i) == ' ')
            {
                s++;
            }
            else
                specialchar++;

        }
        System.out.println(v+"vowels");
        System.out.println(c+"consonants");
        System.out.println(d+"digits");
        System.out.println(s+"space");
    }
}
