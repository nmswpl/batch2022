package in.co.nmsworks.exercise2;
//. Given an array of integers and int x, Write a Program to print no of occurance of x in the array
public class problem18 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,3,4,2,3,2};
        int n=2,count=0;
        for(int x:arr){
            if(x==n)
            {
                count++;

            }
        }
        System.out.println(count);
    }
}
