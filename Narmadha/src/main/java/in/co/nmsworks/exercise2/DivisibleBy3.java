package in.co.nmsworks.exercise2;

public class DivisibleBy3 {
    //program to print all numbers divisible by 3 greater than 300 and less than 400.
    public static void main(String[] args) {

        for(int i=301;i<=400;i++){
            if(i%3==0){
                System.out.println(i);
            }

        }
    }
}
