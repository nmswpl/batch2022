package in.co.nmsworks.excercise2;

/*2. Write a program to print the Grade for given Mark.
        Mark Slab : 91-100 = S; 81-90 = A;
        71-80 = B; 61-70 = C ;
        51-60 = D; Every thing else : F*/

import java.util.Scanner;

public class Grade2 {
    public static void main(String[] args) {
        int score;
        char grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Mark");
        score=sc.nextInt();
        if(score>=91){
           grade='S';

        }
        else if(score>=81){
            grade='A';
        }
         else if(score>=71)  {
             grade = 'B';
            }
         else if (score>61){
            grade='C';
        }
        else if (score>=51){
            grade='D';
        }

        else {
             grade = 'F';
        }
            System.out.println(" Your Grade is : " + grade);
        }

    }

