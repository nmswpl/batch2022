// 10. Write a program to print all numbers between 200 and 500 ending with 7.
package in.co.nmsworks.exercise2;

public class Program10 {
    public static void main(String[] args) {
        for(int i=200;i<500;i++){
            if(i%10 ==7){
                System.out.println(i);
            }
        }
    }
}
