public class DigitCount {

    //counting number of digits
    public static void main(String[] args) {
        int num = 58923;
        int count=0;
        while(num>0)
        {
            num = num/10;
            count++;
        }

        System.out.println(count);
    }
}
