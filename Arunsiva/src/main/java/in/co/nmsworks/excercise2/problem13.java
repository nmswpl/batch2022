package in.co.nmsworks.excercise2;
//Given an array of integers, Write a Program to find the sum of the elements of the array

public class problem13 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
