package in.co.nmsworks.exercise2;

public class CountAndPrintEvenElements {
    //Given an array of integers, Write a Program to count and print even elements.
    public static void main(String[] args) {
       int[] arr = {2, 3, 4, 5, 6};
       int countEven=0;
       for(int i=0;i< arr.length;i++){

           if(arr[i] % 2==0){
             countEven++;
             System.out.println(arr[i] );
           }
       }
        System.out.println("even count is " +countEven);
    }
}
