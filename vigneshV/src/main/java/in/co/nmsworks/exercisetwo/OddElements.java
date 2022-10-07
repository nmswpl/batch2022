package in.co.nmsworks.exercisetwo;

public class OddElements {
    public static void main(String[] args) {
        int[] arr = {32, 43, 4, 15};
        int oddcount =0;
        for(int i:arr) {
            if (i % 2 != 0) {
                System.out.println(i);
                oddcount++;
            }

        }
        System.out.println(oddcount+" odd elements");

    }
}
