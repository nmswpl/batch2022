//factorial program (16)
//input n=5;


package in.co.nmsworks.exercise2;

public class Factorial16 {
    public static void main(String[] args) {
        int i,fact=1;
        int number=5;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}





