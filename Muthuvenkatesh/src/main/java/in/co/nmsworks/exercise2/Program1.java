// 1. Write a program to print all even numbers between 601 and 700 in descending order.
package in.co.nmsworks.exercise2;

import java.util.ArrayList;

public class Program1{
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for(int i=601;i<=700;i++){
            if(i%2==0){
                evenNumbers.add(i);
            }
        }
        //System.out.println(evenNumbers);
        for(int i=evenNumbers.size()-1;i>=0;i--){
            System.out.println(evenNumbers.get(i));
        }
    }
}
