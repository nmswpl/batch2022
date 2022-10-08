package in.co.nmsworks.exercise2;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr={2,3,7,9,5};
        int temp = 0;
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = i+1; j <i ; j++) {
                if (arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }

        }
        System.out.println(temp);

    }
}
