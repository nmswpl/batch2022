package in.co.nmsworks.execise1;

public class SquareArrayElement {
    public static void main(String[] args) {
        int GivenArray[] = {3,4,2,1};
        for (int i = 0; i < GivenArray.length; i++)
        {
            GivenArray[i] = GivenArray[i]*GivenArray[i];
            System.out.println(GivenArray[i]);
        }
    }
}
