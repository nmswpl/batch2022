package in.co.nmsworks.excercise1;

public class FactorialFor {
        public static void main(String[] args){
            int i,fact=1;
            int number=10;
            for(i=1;i<=number;i++){
                fact=fact*i;
            }
            System.out.println("Factorial of "+number+" is: "+fact);
        }

}
