package in.co.nmsworks.exercise2;

public class PrintHundredPositionNumber {
    public static void main(String[] args) {
        int value=555;
        int div=value/100;
        System.out.println(div);
        String[] arr={"zero","one","two","three","four","five","six","seven","eight","nine"};
        for (int i = 0; i < arr.length; i++) {
            if (div==i)
            {
                System.out.println(arr[i]);
            }

        }


    }
}
