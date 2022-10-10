package in.co.nmsworks.exercise2;

public class PrimeOrNot {
    //Given an integer x, Write a Program to check whether x is Prime or not ?
    public static void main(String[] args) {


    int x=5;
    boolean flag=false;
    for (int i=2;i<=x % 2 ;i++) {
        //condition for non - prime number
        if (x % i == 0) {
            flag = true;
            break;
        }
    }
        if(!flag){
            System.out.println(x + " is  prime number ");
        }
        else{
            System.out.println("it is not a prime number");
        }

    }

}

