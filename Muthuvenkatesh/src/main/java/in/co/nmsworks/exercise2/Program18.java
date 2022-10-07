// 18. Given an array of integers and int x, Write a Program to print no of occurance of x in the array
package in.co.nmsworks.exercise2;

public class Program18 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 3};
        int x=2;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println(count);
    }
}

