package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class Problem13 {
    public static void biggestOfNumInList() {
        int n1, n2, n3;
        n1 = 10;
        n2 = 45;
        n3 = 34;
        if ((n1 > n2) && (n1 > n3)) {
            System.out.println("N1 is greater");
        } else if ((n2 > n1) && (n2 > n3)) {
            System.out.println("N2 is greater");
        } else {
            System.out.println("N3 is greater");
        }
    }

    public static void main(String[] args) {
        biggestOfNumInList();
    }
}