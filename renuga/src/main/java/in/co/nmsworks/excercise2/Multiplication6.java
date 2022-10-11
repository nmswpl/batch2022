package in.co.nmsworks.excercise2;

/*6. Write a program to print the multiplication table of 17 upto 10 numbers.
        Expected Output : 17 x 1 = 17 ...... 17 x 10 = 170*/

public class Multiplication6 {
    public static void main(String[] args) {
        int num=17;
        for(int i=1; i<=10; i++){
            System.out.printf("%d * %d = %d \n", num, i, i* num);

        }
    }
}
