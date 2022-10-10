//program for to print the sum of the elements in the array(13)
//input arr={4,2,4,5,6}

package in.co.nmsworks.exercise2;

public class SumOfNumbersInArray13 {
    public static void main(String[] args) {
        int arr[]=new int[]{4,2,4,5,6};
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println("sum of the numbers in the array:"+sum);
        }
    }

