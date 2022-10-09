package in.co.nmsworks.exercise2;

public class MultipleTheArrayElement {
    public static void main(String[] args) {
        int[] arr1={2,4,1};
        int[] arr2={3,5,7};
        int value1=0;
        int value2=0;
        int result=0;
        for (int i = 0; i < arr1.length; i++) {
            value1 = arr1[i];
            value2 = arr2[i];
            result = value1 * value2;
            System.out.println(result);
        }


    }
}
