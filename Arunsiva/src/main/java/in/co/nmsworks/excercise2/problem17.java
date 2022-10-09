package in.co.nmsworks.excercise2;
//. Given an array of integer, Write a Program to find the largest element in the given array
public class problem17 {
    public static void main(String[] args) {
        int[] arr={55,54,12,23,15};
        int temp=arr[0];
        for(int i=0;i< arr.length;i++){
            if(temp>arr[i])
            {
                continue;
            }
            else
            {
              temp=arr[i];
            }
        }
        System.out.println(temp);

    }
}
