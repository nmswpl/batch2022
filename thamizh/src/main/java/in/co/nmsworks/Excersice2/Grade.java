package in.co.nmsworks.Excersice2;

import java.util.Scanner;

public class Grade {

//    91-100 = S;
//   81-90 = A;
//    71-80 = B;
//    61-70 = C ;
//    51-60 = D;
//    Every thing else : F

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the mark");
        int mark=in.nextInt();

       if(mark>=91 && mark<=100)
       {
           System.out.println("Grade is S");
       }
       else if (mark>=81 && mark<=90)
       {
           System.out.println("Grade is A");
       }
       else if (mark>=71 && mark<=80)
       {
           System.out.println("Grade is B");
       }
       else if (mark>=61 && mark<=70)
       {
           System.out.println("Grade is C");
       }
       else if (mark>=51 && mark<=60)
       {
           System.out.println("Grade is D");
       }
       else
       {
           System.out.println("F");
       }
    }
}
