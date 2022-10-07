package in.co.nmsworks.excercise1;
import java.util.*;

public class AddTwoNo {
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        System.out.print("Enter two number: ");
        int no1= val.nextInt();
        int no2=val.nextInt();
        int sum=no1+no2;
        System.out.print("The sum is: "+sum);
    }
}

