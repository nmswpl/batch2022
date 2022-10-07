package in.co.nmsworks.excercise2;
import java.util.*;

public class Grade {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        System.out.println("enter mark");
        int givenNo=val.nextInt();
        if(givenNo>=91)
        {
            System.out.println("S");
        }
        else  if(givenNo>=81)
        {
            System.out.println("A");
        }
        else if(givenNo>=71)
        {
            System.out.println("B");
        }
        else if(givenNo>=61)
        {
            System.out.println("C");
        }
        else if(givenNo>=51)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("F");
        }
    }
}
