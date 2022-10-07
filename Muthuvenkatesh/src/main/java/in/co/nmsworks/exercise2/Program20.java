// 20. Given an integer x, Write a Program to check whether x is Prime or not ?
package in.co.nmsworks.exercise2;

public class Program20 {
    public static void main(String[] args) {
        int x = 10;
        boolean flag = true;
        for(int i=2;i<=x/2;i++){
            if(x % i ==0){
                flag = false;
            }
        }
        if(!flag){
            System.out.println(x+" is not prime");
        }
        else{
            System.out.println(x+" is prime");
        }
    }
}
