package in.co.nmsworks.excercise1;
import java.util.*;

public class AddEven {
    public static void main(String[] args) {
    Scanner val=new Scanner(System.in);
    System.out.println("Enter a number");
    int no=val.nextInt();
    if(no%2==0)
    {
        System.out.println(no +" is even");
    }
    else
    {
        System.out.println(no + " is odd");
    }
    }
}
