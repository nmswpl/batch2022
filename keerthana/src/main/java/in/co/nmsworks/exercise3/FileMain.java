package in.co.nmsworks.exercise3;

import java.util.List;
import java.util.Map;

public class FileMain
{
    public static void main(String[] args) throws Exception {
        ReadTheFile r=new ReadTheFile();
        List<Integer> list=r.readTheFileUsingBuffer("/home/nmsadmin/Downloads/Numbers.txt");
        System.out.println(list);
        FindDuplicate fd=new FindDuplicate();
        List<Integer> dup=fd.toFindDuplicate(list);
        System.out.println(dup);


        NoOfOccurenceOfNum count1=new NoOfOccurenceOfNum();
        Map<Integer,Integer> mapSet=count1.NoOfOccurence(list);
        System.out.println(count1.NoOfOccurence(list));

        OccurenceOfNum num=new OccurenceOfNum();
        Map<Integer,List<Integer>> num2=num.occurenceOfNumbers(mapSet);
        System.out.println(num2);

    }

}
