package in.co.nmsworks.exercise2;
//to print the Grade for given Mark.
public class workout2
{
    public static void main(String[] args)
    {
        int mark = 95;
      // : 91-100 = S; 81-90 = A;71-80 = B; 61-70 = C ;51-60 = D; Every thing else : F
       if(mark>=91 && mark<=100)
       {
          System.out.println("GRADE : S");
       }
        else if(mark>=81 && mark<=90)
        {
            System.out.println("GRADE : A");
        }
       else if(mark>=71 && mark<=80)
        {
            System.out.println("GRADE : B");
        }
        else if(mark>=61 && mark<=70)
        {
            System.out.println("GRADE : C");
        }
        else if (mark>=51 && mark<=60)
        {
            System.out.println("GRADE : D");
        }
        else
        {
            System.out.println("F");
        }
          



    }
}
