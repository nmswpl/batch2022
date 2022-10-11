package in.co.nmsworks.exercise3;
import java.util.ArrayList;
import java.util.List;

public class FindDuplicate
{
    public static void main(String[] args) throws Exception
    {
     //FileReading fr=new FileReading();
     List<Integer> res = FileReading.readFile("/home/nmsadmin/Downloads/Numbers.txt");

     FindDuplicate fd=new FindDuplicate();
     fd.findDuplicateNumbers(res);
    }
   public void findDuplicateNumbers(List<Integer> res)
   {

       List<Integer> numbers=new ArrayList<>();
       for (Integer n:res)
       {
           if(numbers.contains(n))
           {
               System.out.println(n+" is duplicate");
           }
           else
           {
               numbers.add(n);
           }
       }
       System.out.println(numbers);
       System.out.println("number of duplicate numbers: "+(res.size()-numbers.size()));

   }


}
