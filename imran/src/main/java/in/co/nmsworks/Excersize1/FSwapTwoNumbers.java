public class FSwapTwoNumbers {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int temp;

        System.out.println("<--------Before swap--------->");
        System.out.println("Num1 = " +num1);
        System.out.println("Num2 = " +num2);
        System.out.println();
    

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("<---------After swap---------->");
        System.out.println("Num1 = " +num1);
        System.out.println("Num2 = " +num2);
      

    }
}
