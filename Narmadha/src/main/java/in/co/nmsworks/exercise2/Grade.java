package in.co.nmsworks.exercise2;


import java.util.Scanner;

public  class  Grade{
    //program to print the Grade for given Mark.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your mark: ");
        int mark=sc.nextInt();
        if(mark>90 && mark<=100){
            System.out.println("S grade");
        } else if (mark>70 && mark<=80) {
            System.out.println("B grade");
        } else if (mark>50 && mark<=60) {
            System.out.println("D grade");
        } else if (mark>80 && mark<=90) {
            System.out.println("A grade");
        } else if (mark>60 && mark<=70) {
            System.out.println("C grade");
        } else {
            System.out.println("F grade");
        }

    }
    }


