package in.co.nmsworks.exercise2;

public class NoOfOccurance {
    //Given an array of integers and int x, Write a Program to print no of occurance of x in
    //the array
    public static void main(String[] args) {
        int []arr={1, 2, 3, 2, 2, 3};
        int no=2;
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==no){
                count++;
            }
        }
        System.out.println(count);
    }
}
