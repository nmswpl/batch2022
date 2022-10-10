package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Counts {
    //count of vowels,consonants,digits,spaces
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the statement: ");
        String str=sc.nextLine();

        int vowelCount=0;
        int consonantCount=0;
        int digitsCount=0;
        int spaceCount=0;
        for(int i=0;i<=str.length()-1;i++)
        {
            char ch=str.charAt(i);
            if(ch =='a'|| ch =='e'||ch=='i'||ch=='o'||ch=='u'&& ch =='A'|| ch =='E'||ch=='I'||ch=='O'||ch=='U'){
                vowelCount++;
            } else if (ch>='a'&&ch<='z') {
                consonantCount++;
            } else if (ch>='0'&&ch<='9') {
                digitsCount++;

            }else{
                spaceCount++;

            }

        }
        System.out.println(vowelCount);
        System.out.println(consonantCount);
        System.out.println(digitsCount);
        System.out.println(spaceCount);


    }
}
