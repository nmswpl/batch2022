//to print the factorial of 5 using while loop(14)

package in.co.nmsworks.exercise1;

public class FactorialWhileLoop14 {
    public static void main(String[] args) {
        int i = 1,fact=1;
        int number=5;
        while(i<=5){
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of" +number+ "is:" +fact);
    }
}
