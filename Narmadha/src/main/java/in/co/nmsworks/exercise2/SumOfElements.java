package in.co.nmsworks.exercise2;

public class SumOfElements {
    //Given an array of integers, Write a Program to find the sum of the elements of the
    //array.
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
