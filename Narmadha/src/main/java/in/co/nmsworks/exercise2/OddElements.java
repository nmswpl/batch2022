package in.co.nmsworks.exercise2;

public class OddElements {
    public static void main(String[] args) {
        //Given an array of integers, Write a Program to print number of odd elements
        int arr[] = {32, 43, 4, 15};
        for(int i=0;i< arr.length;i++){
            if(arr[i] % 2!=0){
                System.out.println(arr[i] + " is an odd element");

            }
        }
    }
}
