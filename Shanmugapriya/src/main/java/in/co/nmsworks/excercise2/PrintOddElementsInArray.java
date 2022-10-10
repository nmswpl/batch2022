package in.co.nmsworks.excercise2;
//Print odd elements in an array
public class PrintOddElementsInArray
{
    public static void main(String[] args) {
        int[] array = {32,43,4,15};
        int even = 0;
        int odd = 0;

        for(int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            } else {
                odd++;
                System.out.println("Reason "+array[i]);
            }
        }
        System.out.println("Odd Elements :"+odd);

    }
}
