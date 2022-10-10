// Program to print no of occurance of x in the array(18)
// Input: arr[] = {1, 2, 3, 2, 2, 3}, x = 2; Output: 3
// Reason: x (2) occurs 3 times in array

package in.co.nmsworks.exercise2;

public class Occurence18 {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,2,2,3};
        int count=0;
        for(int i=0; i<arr.length; i++){
            int x = 2;
            if(x==arr[i]){
                count++;
            }
        }
        System.out.println("x(2) occurs "+ count + " times in array" );
    }
}
