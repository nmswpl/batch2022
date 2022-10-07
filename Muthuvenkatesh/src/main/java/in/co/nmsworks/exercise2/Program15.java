// 15. Given an array of integers, Write a Program to count and print even elements.
package in.co.nmsworks.exercise2;

public class Program15 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        System.out.println("Even Elements = "+count);
    }
}
