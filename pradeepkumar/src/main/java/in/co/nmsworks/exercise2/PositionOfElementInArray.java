package in.co.nmsworks.exercise2;

public class PositionOfElementInArray {
    public static void main(String[] args) {
        int[] arr={7,15,41,37,34,55};
        int search=1;
        int count=0;
        for (int  i = 0; i <arr.length ; i++)
        {
            if (search == arr[i])
            {

                System.out.println(i);
                count++;

            }

        }
        if (count==0)
        {
            System.out.println("-1");
        }


    }

}
