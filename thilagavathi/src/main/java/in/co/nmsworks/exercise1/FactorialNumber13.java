//to print the factorial of 10

package in.co.nmsworks.exercise1;

public class FactorialNumber13 {
    public static void main(String[] args) {
        int i,fact=1;
        int number=10;
        for(i=1; i<=number; i++){
            fact = fact*i;
        }
        System.out.println("factorial of" + number+" is:" + fact);
    }
}
