package in.co.nmsworks.exercise2;
//Given an array of integers, Write a Program to print number of odd elements.
public class problem12 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int count=0;
      for(int x:arr){
          if(x%2!=0){
              System.out.println(x);
              count++;
          }
      }
        System.out.println("The Count of odds are "+count);
    }
}
