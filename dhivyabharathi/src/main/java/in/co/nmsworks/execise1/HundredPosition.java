package in.co.nmsworks.execise1;
//8.Given a 3 digit number, write a program to print the hundred position value in words.
public class HundredPosition {
    public static void main(String[] args) {

    int num = 724;
    int word = num / 100;
        switch (word)
    {
        case 1:
            System.out.println("One");
            break;
        case 2:
            System.out.println("Two");
            break;
        case 3:
            System.out.println("Three");
            break;
        case 4:
            System.out.println("Four");
            break;
        case 5:
            System.out.println("Five");
            break;
        case 6:
            System.out.println("Six");
            break;
        case 7:
            System.out.println("Seven");
            break;
        case 8:
            System.out.println("Eight");
            break;
        case 9:
            System.out.println("Nine");
            break;
        default:
            System.out.println("Zero");
            break;
    }

}
}
