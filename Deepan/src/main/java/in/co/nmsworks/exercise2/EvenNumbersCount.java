package exercise2;

public class EvenNumbersCount {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int count=0;
        System.out.println("Even Numbers:");
        for(int i=0 ; i < arr.length ; i++)
        {
            if(arr[i] % 2 == 0)
            {
                count++;
                System.out.println(arr[i] );
            }
        }
        System.out.println("Count: "+count);
    }
}
