package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class Findlargenumber {
    public static void main(String[] args) {
        Scanner lar=new Scanner(System.in);
        System.out.println("Enter three number");
        int number1 = lar.nextInt();
        int number2 = lar.nextInt();
        int number3 = lar.nextInt();
        if(number1>number2 && number1>number3)
        {
            System.out.println( number1 +"is largestnumber");
        }
      else  if(number2>number1 && number2>number3) {
            System.out.println(number2 +"is largest");
        }
         else {
            System.out.println(number3 +"is largest");
        }
    }
}
