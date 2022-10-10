//program  to count vowels,consonants,digits,spaces(25)

package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Program25 {
    public static void main(String[] args) {
        String str;
        int vCount=0,cCount=0,digits=0,spaces=0;

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the String  ");
        str=scan.nextLine();
        for(int i=0; i<=str.length()-1; i++){
            char ch=str.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'
                    ||ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U' ){
                vCount++;
            }
            else if((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' )){
                cCount++;
            }
            else if(ch>='0' && ch<='9')
            {
                digits++;
            }
            else if(ch==' '){
                spaces++;
            }

        }
        System.out.println("\nTotal Vowels: "+vCount);
        System.out.println("Total consonants: "+cCount);
        System.out.println("\nTotal digits: "+digits);
        System.out.println("Total white space : "+spaces);
    }
}

