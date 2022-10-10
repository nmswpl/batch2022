/*19. Calculate the power of a number using a for loop. (E.g : 2 power 3 is 8 [2 x 2 x 2])*/
package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class PowerOfNumber19
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base");
        int base= sc.nextInt();
        System.out.println("enter power");
        int power= sc.nextInt();
        int answer=1;
        for(int i=1;i<=power;i++)
        {
            answer*=base;
        }
        System.out.println("answer is "+answer);
    }
}
