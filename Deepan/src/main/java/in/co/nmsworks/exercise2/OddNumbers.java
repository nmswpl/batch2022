package exercise2;

public class OddNumbers {

    public static void main(String[] args) {
         int[] arr = {2,3,7,9,6,13,56,43,58};
         int count = 0;
         for (int i=0 ; i < arr.length; i++)
         {
             if(arr[i] % 2 != 0)
             {
                 count++;
             }
         }
        System.out.println(count);
    }
}
