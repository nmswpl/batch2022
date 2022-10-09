package in.co.nmsworks.execise1;

public class MultiplicationArrayElement {
    public static void main(String[] args) {
        int FirstArray[] = {3,4,5};
        int SEcondArray[] = {5,6,7};
        int MultiplyArray[] = new int[FirstArray.length];
        if(FirstArray.length==SEcondArray.length)
        {
            for (int i = 0; i < FirstArray.length; i++)
            {
                MultiplyArray[i] = FirstArray[i]*SEcondArray[i];
                System.out.println(MultiplyArray[i]);
            }

        }
        else
        {
            System.out.println("Array size is not Common");
        }
    }
}
