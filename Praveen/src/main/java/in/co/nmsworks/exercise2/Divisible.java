package in.co.nmsworks.exercise2;
//print all numbers divisble by 3 greater than 300 and less than 400
public class Divisible {
    public static void main(String[] args) {
        int number=400;
        for (int i = 300; i <number ; i++) {
            if(i%3==0)
            {
                System.out.println(i);
            }

        }
    }
}
