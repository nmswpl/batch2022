package in.co.nmsworks.execise1;

import java.util.Scanner;

public class Biggest_3 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter first no");
            int n1 = in.nextInt();
            System.out.println("Enter second no");
            int n2 = in.nextInt();
            System.out.println("Enter third no");
            int n3 = in.nextInt();
            if(n1>n2 && n1>n3)
            {
                System.out.println(n1+" is Large");
            } else if (n2>n1 && n2>n3)
            {
                System.out.println(n2+" is large");
            }
            else
            {
                System.out.println(n3+" is large");
            }
        }
    }

