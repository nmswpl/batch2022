//Calculate the power of a number using pow() function
public class PowerFunction {
    public void printPower(double num,double power)
    {
        System.out.println(Math.pow(num,power));
    }

    public static void main(String[] args) {
        PowerFunction exe20=new PowerFunction();
        exe20.printPower(2,3);
    }
}
