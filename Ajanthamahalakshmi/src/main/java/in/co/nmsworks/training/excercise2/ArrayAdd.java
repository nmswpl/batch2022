package in.co.nmsworks.training.excercise2;

public class ArrayAdd {
    public static void main(String[] args)
    {
        int[] arr = {3,4,5};
        int res=0;
        for(int i : arr)
        {
             res = res + i;

        }
        System.out.println("Array add is:" +res);
    }
}
