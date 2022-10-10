package in.co.nmsworks.exercisethree;

import java.io.IOException;
import java.util.*;

public class FileHandler
{
    public static void main(String[] args) throws IOException
    {
        ReadFile filereader = new ReadFile();
        List<Integer> numbers = new ArrayList<>(filereader.fileParser("/home/nmsadmin/Downloads/Numbers.txt"));
        searchDuplicate(numbers);
        //findOccurance(numbers);


    }

//    private static void findOccurance(List<Integer> numbers)
//    {
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i :numbers)
//            map.put(i,map.getOrDefault(i,0)+1);
//        System.out.println(map);
//    }

    private static void searchDuplicate(List<Integer> numbers)
    {

        ArrayList<Integer> duplicateNum = new ArrayList<>();
        for(int i:numbers)
        {
            if(!duplicateNum.contains(i))
                duplicateNum.add(i);
            else
                System.out.print(" "+i);
        }

    }
}
