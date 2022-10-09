package in.co.nmsworks.Excersice2;

import java.util.Scanner;

public class PositionOfGivenElement {


    public void checkElement() {
        int[] arr1 = new int[]{7, 15, 41};

        boolean n = false;

        Scanner in = new Scanner(System.in);
        System.out.println("Search Element");
        int element = in.nextInt();

        int i = 0;


        for (i = 0; i < arr1.length; i++) {

            if (element == arr1[i]) {
                System.out.println(i);

                n = true;
            }
        }
        if (!n) {
            System.out.println("-1");

        }
    }




    public static void main(String[] args) {

        PositionOfGivenElement p=new PositionOfGivenElement();
        p.checkElement();
    }
}