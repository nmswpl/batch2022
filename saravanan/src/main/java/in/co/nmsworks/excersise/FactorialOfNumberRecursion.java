package in.co.nmsworks.excersise;

import java.util.Scanner;

public class FactorialOfNumberRecursion
{
    public static void main(String[] args)
    {
       FactorialOfNumberRecursion obj =new FactorialOfNumberRecursion();
        int number =6 ;
        System.out.println(obj.recursionCall(number));
    }
    public int  recursionCall(int number)
    {
        if(number !=0)
            return  number* recursionCall(number-1);
        else
            return 1;
    }
}
