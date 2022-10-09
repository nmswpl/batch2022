package in.co.nmsworks.exercise2;
//program to print the Grade for given Mark
public class GradeMark {
    public static void main(String[] args) {
        int mark=65;
        if (mark>=91 && mark<=100)
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
           System.out.println("Grade is F");
        }
    }
}
