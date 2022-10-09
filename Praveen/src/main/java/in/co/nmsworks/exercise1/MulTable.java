//Multiplication Table using for loop
public class MulTable {
    public void printTable(int n)
    {
        for(int i=1;i<=10;i++)
        {
            int p=n*i;
            System.out.println(n+"*"+i+"="+p);
        }
    }

    public static void main(String[] args) {
        MulTable exe15=new MulTable();
        exe15.printTable(5);
    }
}
