package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class FloatMultiply {
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        System.out.print("Enter two number: ");
        float no1= val.nextFloat();
        float no2=val.nextFloat();
        float mul=no1+no2;
        System.out.print("The sum is: "+mul);
    }
}
