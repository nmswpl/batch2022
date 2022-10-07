package in.co.nmsworks.excercise2;
//Given an integer x, Write a Program to check whether x is Prime or not ?
public class problem20
{
    public static void main(String[] args) {
        int x=7,fact=0;
        for(int i=1;i<=x;i++) {
            if (x % i == 0) {
                fact++;
            }
        }
            if(fact==2){
                System.out.println(x+" is Prime");
            }
            else {
                System.out.println(x+" is Not Prime");
            }
        }
    }

