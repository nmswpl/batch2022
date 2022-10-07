// 14. Given an array of String, Write a Program to reverse the array and print.
package in.co.nmsworks.exercise2;

public class Program14 {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c'};
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
