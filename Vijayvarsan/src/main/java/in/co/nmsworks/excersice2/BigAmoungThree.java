package in.co.nmsworks.excersice2;

public class BigAmoungThree {
    //11. Write a program to print the biggest of the 3 numbers
    //E.g : Input : 12, 24, 5 Output : 24 ; Input2 : 18, 18, 35 Output : 35

    public static void main(String[] args) {
        int first=18,second=18,third=35;
        if (first>second && first>third)
            System.out.println("BIG IS = "+ first);
        else if (second>third && second > first)
            System.out.println("BIG IS = " + second);
        else
            System.out.println("BIG IS = "+third);
    }
}
