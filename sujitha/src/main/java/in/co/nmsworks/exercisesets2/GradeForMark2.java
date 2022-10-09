/*2. Write a program to print the Grade for given Mark.
Mark Slab : 91-100 = S;
81-90 = A;
71-80 = B;
61-70 = C ;
51-60 = D;
Every thing else : F*/
package in.co.nmsworks.exercisesets2;

import java.util.Scanner;

public class GradeForMark2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks");
        int n= sc.nextInt();
        if(n>=91 & n<=100)
        {
            System.out.println("grade is s");
        }
        else if (n>=81 & n<=90)
        {
            System.out.println("grade is A");
        }
        else if (n>=71 & n<=80)
        {
            System.out.println("grade is B");
        }
        else if (n>=61 & n<=70)
        {
            System.out.println("grade is C");
        }
        else if (n>=51 & n<=60)
        {
            System.out.println("grade is D");
        }
        else {
            System.out.println("fail");
        }




    }
}
