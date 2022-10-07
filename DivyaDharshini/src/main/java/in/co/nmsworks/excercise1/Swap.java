package in.co.nmsworks.excercise1;
import java.util.*;
public class Swap {
        public static void main(String[] args) {
            float a, b, temp;
            Scanner val = new Scanner(System.in);
            System.out.println("Enter two numbers\n");
            a = val.nextFloat();
            b = val.nextFloat();
            System.out.println("--Before swap--\n");
            System.out.println("First no: "+a +"\nSecond no: "+ b);
            temp = a;
            a = b;
            b = temp;
            System.out.println("--After swap--\n");
            System.out.println("First no: "+a +"\nSecond no: "+ b);
        }

}
