package in.co.nmsworks.Excersice1;

import java.util.Scanner;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("enter a statement");
        String statement=in.nextLine().toLowerCase();
        System.out.println("enter Character");
        char ch=in.next().charAt(0);

//         String input=in.nextLine();
         int count=0;

         char temp;

        for(int i=0;i<statement.length();i++)
         {
             temp=statement.charAt(i);
             if(temp==ch)
             {
                 count++;
             }


         }
        if(count!=0) {
            System.out.println(ch + " is " + count);
        }
        else {
            System.out.println(ch+" is not present");
        }


    }
}
