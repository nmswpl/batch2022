package in.co.nmsworks.excercise2;

//Write a program to print all numbers divisble by 3 greater than 300 and less than 400.

public class problem9 {
    public static void main(String[] args) {

        for( int i=300;i<400;i++){
            if(i%3==0){
                System.out.print(i+" ");

            }
        }

    }
}
