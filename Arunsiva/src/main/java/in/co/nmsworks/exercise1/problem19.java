package in.co.nmsworks.exercise1;

//Calculate the power of a number using a for loop. (E.g : 2 power 3 is 8 [2 x 2 x 2])
public class problem19 {
    public static void main(String[] args) {
        int base=2,power=3,result=1;
        for(;power!=0;power--)
        {
            result=result*base;
        }
        System.out.println("Answer is = "+result);
    }
}
