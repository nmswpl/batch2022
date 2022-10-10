package in.co.nmsworks.excercise1;

public class Count25 {
    public static void main(String[] args) {
        int count=0; int num=8825189;
        while (num!=0){
            num=num/10;
            count++;
        }
        System.out.println("no of digits : " + count);
    }
}
