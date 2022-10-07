//8.Given a 3 digit number, write a program to print the hundred position value in words.
// E.g 1: Input : 542 Output : Five. E.g 2: Input : 777 Output : Seven.

package in.co.nmsworks.training.excercise2;

public class NumberInWords {
    public static void main(String[] args)
    {
        int value = 742;
        int res = value / 100;
        System.out.println(res);
        switch (res)

        {
            case 1 :
                System.out.println("One");
                break;
            case 2 :
                System.out.println("Two");
                break;
            case 3 :
                System.out.println("Three");
                break;
            case 4 :
                System.out.println("Four");
                break;
            case 5 :
                System.out.println("Five");
                break;
            case 6 :
                System.out.println("Six");
                break;
            case 7 :
                System.out.println("Seven");
                break;
            case 8 :
                System.out.println("Eight");
                break;
            default:
                System.out.println("Nine");
                break;

        }






    }
}
