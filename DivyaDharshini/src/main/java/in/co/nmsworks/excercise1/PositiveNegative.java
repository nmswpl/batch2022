package in.co.nmsworks.excercise1;
import java.util.*;
public class PositiveNegative {
        public static void main(String[] args)
        {
            Scanner val=new Scanner(System.in);
            System.out.println("Enter number");
            int num=val.nextInt();
            if(num>0)
            {
                System.out.println("The number is positive.");
            }
            else if(num<0)
            {
                System.out.println("The number is negative.");
            }
            else
            {
                System.out.println("The number is zero.");
            }

    }

}
