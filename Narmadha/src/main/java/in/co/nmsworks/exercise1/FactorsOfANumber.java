package in.co.nmsworks.exercise1;

public class FactorsOfANumber {
    //Write a program to find Factors of a Positive Integer
    public static void main(String[] args) {
        int number=60;
        System.out.println("factors of " + number + " are: ");
        for(int i=1;i<=number;i++){
            if(number%i==0){
                System.out.print( i+ " ");
            }
        }

    }
}
