package in.co.nmsworks.exercise2;
//print the position of given element in an array
public class Position {
    public static void main(String[] args) {
        int[] arr={12,15,6};
        int search=15;
        int count=0;
        int i;

        for( i=0;i< arr.length;i++) {
            if (search == arr[i]) {
                count++;
                System.out.println(i);
            }
        }
        if(count==0)
            System.out.println(-1);
        }

        }


