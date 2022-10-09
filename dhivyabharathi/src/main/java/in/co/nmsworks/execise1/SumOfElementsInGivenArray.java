package in.co.nmsworks.execise1;

public class SumOfElementsInGivenArray {
    public static void main(String[] args) {
        int GivenArray[] = {1,2,3,4};
        int Sum = 0;
        for (int i = 0; i < GivenArray.length; i++) {
             Sum = Sum + GivenArray[i];
        }
        System.out.println("Sum of Given Array : "+Sum);
    }
}
