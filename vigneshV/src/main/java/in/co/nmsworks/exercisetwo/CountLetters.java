
//Write a program to check if a given Character is a Vowel or Consonant.

package in.co.nmsworks.exercisetwo;


import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine().toLowerCase();
        int countVowels = 0;
        int countConsonet = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);

            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                countVowels++;
            else if (Character.isAlphabetic(c))
                countConsonet++;

        }
        System.out.println("Vowels - "+countVowels+'\n'+"Consonet - "+countConsonet);
    }

    public static class Evennum
    {
        public static void main(String[] args) {
            for(int i=700;i>600;i--)
            {
                if(i%2==0)
                    System.out.print(i+" ");
            }
        }
    }
}
