package in.co.nmsworks.Excersice1;

import java.util.Scanner;

public class ASCIvalue {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("enter a character");
        char ch=in.next().charAt(0);

        int asci=(int) ch;

        System.out.println(asci);
    }
}
