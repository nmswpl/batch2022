package in.co.nmsworks.Excersice2;

public class SumOfElementsInArray {
    public static void main(String[] args) {


        int[] array = new int[]{5, 77, 22, 3, 5};
        int sum=0;

        for(int i=0;i<array.length;i++)
        {
            sum=sum+array[i];

        }
        System.out.println(sum);
    }
}
