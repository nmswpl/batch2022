package in.co.nmsworks.training.excercise2;

public class ArrayOccurences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 3};
        int x= 2;
        int count =0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i] == 2)
            {
                count++;
            }
        }
        System.out.println(x+" occurs "+count+ " times in array ");
    }
}
