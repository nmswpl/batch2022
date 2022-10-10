/*8.Given a 3 digit number, write a program to print the hundred position value in words.
E.g 1: Input : 542 Output : Five.
E.g 2: Input : 777 Output : Seven.*/
package in.co.nmsworks.exercisesets2;

import java.util.Scanner;

public class HundredPositionValue8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int number= sc.nextInt();
        String[] valueInWords={"0ne","two","three","four","five","six","seven","eight","nine"};
        int result=number/100;
        //System.out.println(" "+result);
        for (int i=1;i<=valueInWords.length;i++)
        {
            if(result==i)
            {
                System.out.println(valueInWords[i-1]);
            }
        }

    }
}
