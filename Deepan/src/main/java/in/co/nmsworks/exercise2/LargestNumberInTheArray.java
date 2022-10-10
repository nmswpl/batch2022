package exercise2;

//Finding largest number in the array
public class LargestNumberInTheArray {

    public static void main(String[] args) {
        int[] arr = {9,435,342,3,2,1,345,784};
        int temp = arr[0];
        for(int i=0 ; i < arr.length ;i++)
        {
            if(temp > arr[i])
            {
                continue;
            }
            else {
                temp = arr[i];
            }
        }

        System.out.println(temp);
    }
}
