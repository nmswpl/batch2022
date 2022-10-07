//sum of the elements in the array

package in.co.nmsworks.exercise2;

public class e13 {
    public static void main(String[] args) {
        int arr[]=new int[]{4,2,4,5,6};
        int sum=0,n;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println("sum of the numbers in the array:"+sum);
        }
    }

