// 17. Given an array of integer, Write a Program to find the largest element in the given array.
package in.co.nmsworks.exercise2;

public class Program17 {
    public static void main(String[] args) {
        int[] arr = {12, 3, 20, 14};
        int max =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest Element = "+ max);
    }
}
