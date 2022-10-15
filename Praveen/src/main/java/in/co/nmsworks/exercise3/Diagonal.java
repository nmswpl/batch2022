package in.co.nmsworks.exercise3;

import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        diagonal();
    }
    public static void  diagonal()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size");
        int num=s.nextInt();
        char c='a';
        for (int i =0; i <num; i++) {
//            System.out.println(i);
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }
            System.out.println(c++);
        }
    }
    }
