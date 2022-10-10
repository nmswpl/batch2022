package in.co.nmsworks.exercise2;
//Write a program to print the Grade for given Mark.
public class problem2 {
    public static void main(String[] args)
    {
     int mark=65;

     if(mark>=91 && mark<=100)
     {
         System.out.println("S Grade");
     }
     else if(mark>=71 && mark<=80)
     {
         System.out.println("B Grade");
     } else if (mark>=61 && mark<=70)
     {
         System.out.println("C Grade");
     } else if (mark>=51 && mark<=60)
     {
         System.out.println("D Grade");
     }
     else {
         System.out.println("Fail F");
     }
    }
}
