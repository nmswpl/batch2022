//Program to Add Two Integers
public class AddNum {

    public void printTwoNum(int a,int b) {
        int n=a+b;
        System.out.println("Enter two Numbers "+a+" "+b);
        System.out.println("The sum is:"+n);
    }


    public static void main(String[] args) {
        AddNum addNum=new AddNum();
        addNum.printTwoNum(10,20);

    }
}
