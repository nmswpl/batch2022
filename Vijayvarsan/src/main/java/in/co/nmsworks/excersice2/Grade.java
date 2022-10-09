package in.co.nmsworks.excersice2;

public class Grade {
    //2. Write a program to print the Grade for given Mark.
    //Mark Slab : 91-100 = S;
    //81-90 = A;
    //71-80 = B;
    //61-70 = C ;
    //51-60 = D;
    //Every thing else : F

    public static void main(String[] args) {
        int mark=35;

        if (mark>=90 && mark<=100)
         System.out.println("Grade = S");

        else if(mark>=81 && mark<=90)
            System.out.println("GRADE = A");
        else if(mark>70 && mark <=80)
            System.out.println("GRADE = B");
        else if(mark>60 && mark <=70)
            System.out.println("GRADE = C");
        else if(mark>50 && mark <=60)
            System.out.println("GRADE = D");
        else
            System.out.println("FAIL");

    }
}