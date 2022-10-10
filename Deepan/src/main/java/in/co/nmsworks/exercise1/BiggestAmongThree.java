public class BiggestAmongThree {

    //Finding the biggest number among three
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 12;
        int num3 = 8;

        if ( num1 > num2 && num1 > num3)
            System.out.println(num1 + " is Biggest");
        else if(num2 > num1 && num2 > num3)
            System.out.println(num2+ " is Biggest");
        else
            System.out.println(num3+ " is Biggest");
    }
}
