package in.co.nmsworks.excercise;

public class Multiplication {
    //15. Generate Multiplication Table using for loop

    public static void main(String[] args) {
                System.out.println("MULTIPLICATION TABLE");
        int table = 5;
        for (int i=0;i<=10;i++)
        {
            int value = table *i;
            System.out.println(table +"*"+i+"="+ value);
        }

    }
}
