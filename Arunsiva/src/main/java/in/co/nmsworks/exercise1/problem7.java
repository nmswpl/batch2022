import java.util.Scanner;

public class problem7 {

    //Check whether a number is even or odd using if...else statement


    public static void main(String[] args) {
        int num;
        Scanner values=new Scanner(System.in);
        System.out.println("Enter the number ");
        num=values.nextInt();


        if(num%2==0) {
            System.out.println(num + " is a even number ");
        }
            else{
                System.out.println(num+" is a odd number");
            }
        }
    }

