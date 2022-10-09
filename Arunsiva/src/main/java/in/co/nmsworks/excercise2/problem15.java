package in.co.nmsworks.excercise2;
//Given an array of integers, Write a Program to count and print even elements.

public class problem15 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12};
        int count=0;
        for(int x:arr)
        {
            if(x%2==0){
                System.out.print(x+" ");
                count++;

            }
        }
        System.out.println("No of even numbers are: "+count);

    }
}
