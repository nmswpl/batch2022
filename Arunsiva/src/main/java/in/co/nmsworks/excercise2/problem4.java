package in.co.nmsworks.excercise2;
//Write a program to print the position of given element in an array. If not present, print -1
public class problem4 {
    public static void main(String[] args) {
        int[] arr ={4,15,71,42,13};
        int n=42;
        boolean position=false;


        for(int i=0;i< arr.length;i++){
            if(n==arr[i])
            {
                position=true;
                System.out.println("position of given number is : "+i);
            }

        }
        if(position==false)

            System.out.println("Output is -1");



    }
}
