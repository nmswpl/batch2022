
//Print an Integer entered by the User
public class PrintInt {

    public void printNumber(int number) {
//        this.number = number;
        System.out.println("Enter a number:"+number);
        System.out.println("You entered:"+number);
    }



    public static void main(String[] args) {
        PrintInt printInt=new PrintInt();
        printInt.printNumber(10);

    }

}
