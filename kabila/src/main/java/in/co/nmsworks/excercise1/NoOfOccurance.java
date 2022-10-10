package in.co.nmsworks.excercise1;

public class NoOfOccurance {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 3};
        int no = 3;
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == no)
                count++;
        }
        System.out.println(count);
    }

}
