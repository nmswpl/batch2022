package in.co.nmsworks.excercise1;
import java.util.*;

public class LargeThree {
        public static void main(String[] args)
        {
            Scanner val=new Scanner(System.in);
            System.out.println("Enter three Nos");
            int a=val.nextInt();
            int b=val.nextInt();
            int c=val.nextInt();
            if(a>=b && a>=c)
                System.out.println(a+" is the largest Number");
            else if (b>=a && b>=c)
                System.out.println(b+" is the largest Number");
            else
                System.out.println(c+" is the largest number");
        }
}
