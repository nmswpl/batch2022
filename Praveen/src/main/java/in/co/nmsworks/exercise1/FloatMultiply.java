//Multiply Two Floating-Point Numbers
public class FloatMultiply {
    public void printProduct(float a,float b)
    {
        float p=a*b;
        System.out.println("The Product is:"+p);
    }

    public static void main(String[] args) {
        FloatMultiply exe3=new FloatMultiply();
        exe3.printProduct(2.00F,3.00F);
    }
}
